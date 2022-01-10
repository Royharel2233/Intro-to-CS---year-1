// import java.util.ListIterator;

// package MMS;
/**
 * Represents a managed memory space (also called "heap"). The memory space is managed by three  
 * methods: <br> <b> malloc </b> allocates memory blocks, <br> <b> free </b> recycles memory blocks,
 * <br> <b> defrag </b> reorganizes the memory space, for better allocation and rescheduling.
 * <br> (Part of Homework 10 in the Intro to CS course, Efi Arazi School of CS)
 */
public class MemorySpace {
	
	// A list that keeps track of the memory blocks that are presently allocated
	private List allocatedList;

	// A list that keeps track of the memory blocks that are presently free
	private List freeList;

	private int oldLength = 0;

	/**
	 * Constructs a managed memory space ("heap") of a given maximal size.
	 * 
	 * @param maxSize The size of the memory space to be managed
	 */
	public MemorySpace(int maxSize) {
		// Constructs and intilaizes an empty list of allocated memory blocks, and a free list containing
		// a single memory block which represents the entire memory space. The base address of this single
		// memory block is zero, and its length is the given memory size (maxSize).
		allocatedList = new List();
		freeList = new List();
		freeList.addLast(new MemBlock(0, maxSize));
	}

	/**
	 * Allocates a memory block.
	 * 
	 * @param length The length (in words) of the memory block that has to be allocated
	 * @return the base address of the allocated block, or -1 if unable to allocate
	 */
	public int malloc(int length) {
	    // Scans the freeList, looking for the first free memory block whose length equals at least
		// the given length. If such a block is found, the method performs the following operations:
		// ListIterator iterator = freeList.iterator();
		ListIterator iterator = new ListIterator(freeList.getNode(0));
		MemBlock freeMemBlock = null;
		while (iterator.hasNext() && freeMemBlock == null) {
			MemBlock nextMeM = iterator.current.block;
			if (nextMeM.length >= length) {
				freeMemBlock = nextMeM;
			}
			iterator.next();
		}
		
		if (freeMemBlock != null) {
			// (1) A new memory block is constructed. The base address of the new block is set to
			//     the base address of the found free block. The length of the new block is set to the value 
			//     of the method's length parameter.
			MemBlock newMemBlock = new MemBlock(freeMemBlock.baseAddress, length);

			// (2) The new memory block is appended to the end of the allocatedList.
			allocatedList.addLast(newMemBlock);

			// (3) The base address and the length of the found free block are updated, to reflect the allocation.
			//     For example, suppose that the requested block length is 17, and suppose that the base
			//     address and length of the the found free block are 250 and 20, respectively.
			//     In such a case, the base address and length of of the allocated block are set to 250 and 17, 
			//     respectively, and the base address and length of the found free block are updated to 267 and 3, respectively.
			if (length == freeMemBlock.length) {
				freeList.remove(freeMemBlock);
			} else {
				freeMemBlock.baseAddress = freeMemBlock.baseAddress + length;
				freeMemBlock.length = freeMemBlock.length - length;
			}

			// (4) The base address of the new memory block is returned.
			return newMemBlock.baseAddress;
		}
		
		if (length != oldLength) {
			oldLength = length;
			defrag();
			return malloc(length);
		}
		return -1;
	}

	/**
	 * Frees the memory block whose base address equals the given address
	 * 
	 * @param address The base address of the memory block to free
	 */
	public void free(int address) {
		// Adds the memory block to the free list, and removes it from the allocated list.
		// allocatedList.
		ListIterator iterator = new ListIterator(allocatedList.getNode(0));
		while (iterator.hasNext()) {
			MemBlock nextMeM = iterator.current.block;
			if (nextMeM.baseAddress == address) {
				freeList.addLast(nextMeM);
				allocatedList.remove(nextMeM);
				break;
			}

			iterator.next();
		}
	}
	
	/**
	 * A textual representation of this memory space
	 * @return a string representation of this memory space.
	 */
	public String toString() {
		// Returns the textual representation of the free list, a new line, and then
        // the textual representation of the allocated list, as one string
		StringBuilder str = new StringBuilder(freeList.toString());
		str.append("\n");
		str.append(allocatedList.toString());
		return str.toString();
	}
	
	/**
	 * Performs a defragmantation of the memory space.
	 * Can be called periodically, or by malloc, when it fails to find a memory block of the requested size.
	 */
	public void defrag() {
		List newFreeList = freeList;
		ListIterator iterator1 = freeList.iterator();
		while (iterator1.hasNext()) {
			MemBlock firstListMeM = iterator1.next();
			MemBlock secondListMeM = null;
			ListIterator iterator2 = newFreeList.iterator();
			while (iterator2.hasNext()) {
				MemBlock tempMeM = iterator2.next();
				if (firstListMeM.baseAddress + firstListMeM.length == tempMeM.baseAddress) {
					secondListMeM = tempMeM;
				}
			}

			if (secondListMeM != null) {
				MemBlock combinedMeM = new MemBlock(firstListMeM.baseAddress, firstListMeM.length + secondListMeM.length);
				newFreeList.remove(firstListMeM);
				newFreeList.remove(secondListMeM);
				newFreeList.addLast(combinedMeM);
			}
		}

		freeList = newFreeList;
	}
}

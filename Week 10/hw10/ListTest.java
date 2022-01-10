import MMS.*;

/** Tests the methods of the List class.  */
public class ListTest {

    // To make the tests code compact, we declare a class-level list,  
    // and a few class-level memory blocks. The contents of the memory blocks 
    // is the same as described in the examples of the Homework 10 document.
    // All the tests in this class can use these class-level variables. 
    private static List list;

    private static MemBlock fb1 = new MemBlock(208,10);
    private static MemBlock fb2 = new MemBlock(352,12);
    private static MemBlock fb3 = new MemBlock(250,20);

    private static MemBlock ab1 = new MemBlock(50,3);
    private static MemBlock ab2 = new MemBlock(370,2);

    public static void main (String[] args) {
        // testAddLast();
        // testAddFirst();
        // testGetNode();
        // testGetBlock();  // Very similar to testGetNode
        // testIndexOf();
        ////testAdd1();
        ////testAdd2();
        testRemoveFirst();
        // testRemove();
    }  
    
    // Tests the AddLast method of the List class.
    // Illustrates how to use the class-level variables.
    // All the other tests in this class can look more or less the same as this test.
    private static void testAddLast() {
        list = new List();  System.out.println(list);
        list.addLast(fb1);  System.out.println(list);
        list.addLast(fb2);  System.out.println(list);
        list.addLast(fb3);  System.out.println(list);
    }

    private static void testAddFirst() {
        list = new List();  System.out.println(list);
        list.addFirst(fb1);  System.out.println(list);
        list.addFirst(fb2);  System.out.println(list);
        list.addFirst(fb3);  System.out.println(list);
        //// Write your test code here
    }

    private static void testGetNode() {
        list = new List();  System.out.println(list);
        list.addLast(fb1);  System.out.println(list);
        list.addLast(fb2);  System.out.println(list);
        list.addLast(fb3);  System.out.println(list);
        System.out.println(list.getNode(2));
        System.out.println(list.getNode(1));
        System.out.println(list.getNode(0));
        System.out.println(list.getNode(-1));
        //// Write your test code here
    }

    private static void testGetBlock() {
        //// Write your test code here
        list = new List();  System.out.println(list);
        list.addLast(fb1);  System.out.println(list);
        list.addLast(fb2);  System.out.println(list);
        list.addLast(fb3);  System.out.println(list);
        System.out.println(list.getBlock(2));
        System.out.println(list.getBlock(1));
        System.out.println(list.getBlock(0));
        System.out.println(list.getBlock(-1));
    }

    private static void testIndexOf() {
        list = new List();  System.out.println(list);
        list.addLast(fb1);  System.out.println(list);
        list.addLast(fb2);  System.out.println(list);
        list.addLast(fb3);  System.out.println(list);
        System.out.println(list.indexOf(fb1));
        System.out.println(list.indexOf(fb2));
        System.out.println(list.indexOf(fb3));
        System.out.println(list.indexOf(ab1));
        //// Write your test code here
    }

    private static void testAdd1() {
        list = new List();  System.out.println(list);
        list.addLast(fb1);  System.out.println(list);
        list.addLast(fb2);  System.out.println(list);
        list.addLast(fb3);  System.out.println(list);
        //// Write your test code here
    }

    private static void testAdd2() {
        list = new List();  System.out.println(list);
        list.addLast(fb1);  System.out.println(list);
        list.addLast(fb2);  System.out.println(list);
        list.addLast(fb3);  System.out.println(list);
        //// Write your test code here
    }

    private static void testRemoveFirst() {
        list = new List();  System.out.println(list);
        list.addLast(fb1);  System.out.println(list);
        list.addLast(fb2);  System.out.println(list);
        list.addLast(fb3);  System.out.println(list);
        list.removeFirst();   System.out.println(list);
        //// Write your test code here
    }

    private static void testRemove() {
        list = new List();  System.out.println(list);
        list.addLast(fb1);  System.out.println(list);
        list.addLast(fb2);  System.out.println(list);
        list.addLast(fb3);  System.out.println(list);
        list.remove(fb3);   System.out.println(list);
        //// Write your test code here
    }
}

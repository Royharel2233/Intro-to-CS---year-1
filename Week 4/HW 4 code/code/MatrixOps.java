/**
 * A library of basic matrix operations.
 */
public class MatrixOps {
	/**
	 * Returns the matrix resulting from adding the two given matrices,
	 * or null if the matrices don't have the same dimensions.
	 */
	public static int[][] add(int[][] m1, int[][] m2) {
		int m1Rows = m1.length;
		int m1Colums = m1[0].length;
		int m2Rows = m2.length;
		int m2Colums = m2[0].length;
		if (m1Colums != m2Colums || m2Rows != m1Rows) {
			return null;
		}

		int[][] newMatrix = new int[m1Rows][m1Colums];
		for (int i = 0; i < m1Rows; i++) {
			for (int j = 0; j < m1Colums; j++) {
				newMatrix[i][j] = m1[i][j] + m2[i][j];
			}
		}
		return newMatrix;
	}

	/**
	 * Returns a unit matrix of the given size.
	 * A unit matrix of size N is a square N x N matrix that contains 0's
	 * in all its cells, except that the cells in the diagonal contain 1.
	 */
	public static int[][] unit(int n) {
		int[][] imatrix;
		imatrix = new int[n][n];
		for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (row == col) {
					imatrix[row][col] = 1;
                } else {
					imatrix[row][col] = 0;
                }
            }
        }
		return imatrix;
	}

	/**
	 * Returns the matrix resulting from multuplying the two matrices,
	 * or null if they have incompatible dimensions.
	 */
	public static int[][] mult(int[][] m1, int[][] m2) {
		int m1Rows = m1.length;
		int m1Colums = m1[0].length;
		int m2Rows = m2.length;
		int m2Colums = m2[0].length;
		int[][] product = new int[m1Rows][m2Colums];

		if (m1Colums != m2Rows) {
			return null;
		}

        for(int i = 0; i < m1Rows; i++) {
            for (int j = 0; j < m2Colums; j++) {
                for (int k = 0; k < m1Colums; k++) {
                    product[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }

        return product;
	} 

	/**
	 * Returns a matrix which is the transpose of the given matrix.
	 */
	public static int[][] transpose(int[][] m) {
		int mRows = m.length;
		int mColums = m[0].length;
		int transpose[][] = new int[mColums][mRows]; 
    
		for (int i = 0; i < mColums; i++){    
			for (int j = 0; j < mRows; j++){    
				transpose[i][j] = m[j][i];  
			}    
		}

		return transpose;
	}

	/**
	 * Prints the given matrix, and then prints an empty line.
	 */
	public static void println(int[][] m) {
		for (int row = 0; row < m.length; row++) {
			for (int col = 0; col < m[1].length; col++) {
				System.out.print(m[row][col] + "  ");
			}
			System.out.println();
		}
		System.out.println();
	}
		
	/** 
	 * Tests all the matrix operations featured by this class.
	 */ 
	public static void main(String args[]) {
		int[][] a = { { 1, 2, 1 },
			          { 0, 1, 1 },
					  { 2, 0, 1 } };

		int[][] b = { { 1, 0, 2 },
			          { 1, 2, 0 },
					  { 2, 0, 1 } };

		System.out.println("Matrix A:");  println(a); 
		System.out.println("Matrix B:");  println(b); 

		System.out.println("A + B:");  println(add(a, b));
		System.out.println("B + A:");  println(add(b, a));
		System.out.println("I (a unit matrix of size 3):"); println(unit(3));

		int[][] c = { { 1, 2, 3 },
		              { 4, 5, 6 }, };
		System.out.println("A * B:");  println(mult(a,b));
		System.out.println("A * I: "); println(mult(a,unit(3)));

		System.out.println("Matrix C:"); println(c);
		System.out.println("C, transposed:"); println(transpose(c));
	}
}
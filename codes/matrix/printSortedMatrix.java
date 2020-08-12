// A Java program to Print all elements 
// in sorted order from row and 
// column wise sorted matrix 
class Solution { 
	static final int INF = Integer.MAX_VALUE; 
	static final int N = 4; 
	static void youngify(int mat[][], int i, int j) { 
		// Find the values at down and right sides of mat[i][j] 
		int downVal = (i + 1 < N) ? 
					mat[i + 1][j] : INF; 
		int rightVal = (j + 1 < N) ? 
					mat[i][j + 1] : INF; 

		// If mat[i][j] is the down right corner element, 
		// return 
		if (downVal == INF && rightVal == INF) 
		{ 
			return; 
		} 

		// Move the smaller of two values 
		// (downVal and rightVal) to mat[i][j] 
		// and recur for smaller value 
		if (downVal < rightVal) { 
			mat[i][j] = downVal; 
			mat[i + 1][j] = INF; 
			youngify(mat, i + 1, j); 
		} else{ 
			mat[i][j] = rightVal; 
			mat[i][j + 1] = INF; 
			youngify(mat, i, j + 1); 
		} 
	} 

	// A utility function to extract 
	// minimum element from Young tableau 
	static int extractMin(int mat[][]) { 
		int ret = mat[0][0]; 
		mat[0][0] = INF; 
		youngify(mat, 0, 0); 
		return ret; 
	} 

	// This function uses extractMin() 
	// to print elements in sorted order 
	static void printSorted(int mat[][]) { 
		System.out.println("Elements of matrix in sorted order n"); 
		for (int i = 0; i < N * N; i++) 
		{ 
			System.out.print(extractMin(mat) + " "); 
		} 
	} 

	// Driver Code 
	public static void main(String args[]) { 
		int mat[][] = {{10, 20, 30, 40}, 
					{15, 25, 35, 45}, 
					{27, 29, 37, 48}, 
					{32, 33, 39, 50}}; 
		printSorted(mat); 
	} 
} 

/*

Input: mat[][]  =  { {10, 20, 30, 40},
                     {15, 25, 35, 45},
                     {27, 29, 37, 48},
                     {32, 33, 39, 50},
                   };

Output:
Elements of matrix in sorted order
10 15 20 25 27 29 30 32 33 35 37 39 40 45 48 50

*/

import java.io.*; 

class Solution { 

static void fill0X(int m, int n) { 
	int i, k = 0, l = 0; 
	int r = m, c = n; 
	char a[][] = new char[m][n]; 
	char x = 'X'; 
	while (k < m && l < n) { 
		/* Fill the first row from the remaining rows */
		for (i = l; i < n; ++i) 
			a[k][i] = x; 
		k++; 
		/* Fill the last column from the remaining columns */
		for (i = k; i < m; ++i) 
			a[i][n-1] = x; 
		n--; 
		/* Fill the last row from the remaining rows */
		if (k < m) { 
			for (i = n-1; i >= l; --i) 
				a[m-1][i] = x; 
			m--; 
		} 
		/* Print the first column 
				// from the remaining columns */
		if (l < n) { 
			for (i = m-1; i >= k; --i) 
				a[i][l] = x; 
			l++; 
		} 

		// Flip character for next iteration 
		x = (x == '0')? 'X': '0'; 
	} 

	// Print the filled matrix 
	for (i = 0; i < r; i++) { 
		for (int j = 0; j < c; j++) 
			System.out.print(a[i][j] + " "); 
		System.out.println(); 
	} 
} 

/* Driver program to test above functions */
public static void main (String[] args) { 

	System.out.println("Output for m = 5, n = 6"); 
	fill0X(5, 6); 

	System.out.println("Output for m = 4, n = 4"); 
	fill0X(4, 4); 

	System.out.println("Output for m = 3, n = 4"); 
	fill0X(3, 4); 
		
	} 
} 

/*

Input: m = 3, n = 3
Output: Following matrix 
X X X
X 0 X
X X X

Input: m = 4, n = 5
Output: Following matrix
X X X X X
X 0 0 0 X
X 0 0 0 X
X X X X X

Input:  m = 5, n = 5
Output: Following matrix
X X X X X
X 0 0 0 X
X 0 X 0 X
X 0 0 0 X
X X X X X

Input:  m = 6, n = 7
Output: Following matrix
X X X X X X X
X 0 0 0 0 0 X
X 0 X X X 0 X
X 0 X X X 0 X
X 0 0 0 0 0 X
X X X X X X X 

*/

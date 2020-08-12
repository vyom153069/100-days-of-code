class Solution{ 
     
     public static int R,C; 
       
     private static void diagonalOrder(int[][] arr) { 
             for (int k = 0; k < R; k++) { 
                 System.out.print(arr[k][0] + " "); 
                 int i = k - 1;     
                 int j = 1;
                 /* Print Diagonally upward */
                 while (isValid(i, j)) { 
                     System.out.print(arr[i][j] + " "); 
                     i--; 
                     j++;    // move in upright direction 
                 } 
                 System.out.println(""); 
             } 
             // Note : we start from k = 1 to C-1; 
             for (int k = 1; k < C; k++) { 
                 System.out.print(arr[R-1][k] + " ");
                 int i = R - 2; 
                 int j = k + 1; 
                 /* Print Diagonally upward */
                 while (isValid(i, j)) { 
                     System.out.print(arr[i][j] + " "); 
                     i--; 
                     j++; 
                 } 
                 System.out.println(""); 
             } 
         }
    public static  boolean isValid(int i, int j) { 
         if (i < 0 || i >= R || j >= C || j < 0) return false; 
         return true; 
     } 
     public static void main(String[] args) { 
              int arr[][] = { {1, 2, 3, 4}, 
                              {5, 6, 7, 8}, 
                              {9, 10, 11, 12}, 
                              {13, 14, 15, 16}, 
                              {17, 18, 19, 20}, }; 
              R=arr.length; 
              C=arr[0].length; 
              diagonalOrder(arr); 
        } 
 } 
          
   
/*
Output:

1
5 2
9 6 3
13 10 7 4
17 14 11 8
18 15 12
19 16
20

*/
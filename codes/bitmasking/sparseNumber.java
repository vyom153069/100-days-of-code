import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//input number
        int n=sc.nextInt();
        System.out.println(consecutive(n));
	}
	public static boolean consecutive(int n){
        return (n&(n>>1))==0;
	}
	
}
/*
Example 1:

Input: N = 2
Output: true
Explanation: Binary Representation of 2 is 10, 
which is not having consecutive set bits. 
So, it is sparse number.

Example 2:

Input: N = 3
Output: false
Explanation: Binary Representation of 3 is 11, 
which is having consecutive set bits in it. 
So, it is not a sparse number.

*/
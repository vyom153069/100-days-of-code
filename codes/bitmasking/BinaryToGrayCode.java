import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//input number
		int x=sc.nextInt();
		System.out.println(gray(x));
	}
	public static int gray(int x){
        int q=x>>1;
        return q*n;
	}
	
}
/*

Input: N = 7
Output: 4

Input: N = 10
Output: 15

Input: N = 0
Output: 0

*/
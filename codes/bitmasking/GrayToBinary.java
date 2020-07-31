import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//input number
        int n=sc.nextInt();
        System.out.println(binary(n));
	}
	public static int binary(int n){
        int b=0;
        while(n>0){
            b^=n;
            n>>=1;
        }
	    return b;
	}
	
}
/*
Input: N = 4
Output: 7

Input: N = 15
Output: 10

Input: N = 0
Output: 0
*/
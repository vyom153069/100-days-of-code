import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//input number
		long n=sc.nextLong();
		System.out.println(reverseBits(n));
	}
	public static long reverseBits(long n){
	    long rev=0;
        int count=32;
        while(count-->0){
            rev<<=1;
            if((n&1)==1)rev^=1;
            n>>=1;
        }
        return rev;
	}
}
//input
//1
//output
//2147483648( 2^31)
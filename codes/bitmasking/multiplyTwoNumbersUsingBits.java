import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//input number
		long x=sc.nextLong();
		long y=sc.nextLong();
		System.out.println(multiply(x,y));
	}
	public static long multiply(long x,long y){
	   long mul=0;
	   for(int i=0;i<y;i++)mul=add(mul,x);
	   return mul;
	}
	public static long add(long a,long b){
	    long carry=0;
	    while(b!=0){
            //carry using and
            carry=(a&b)<<1;
            //sum using xor
	        a=a^b;
	        b=carry;
	    }
	    return a;
	}
}
//input
//2 100
//output
//200

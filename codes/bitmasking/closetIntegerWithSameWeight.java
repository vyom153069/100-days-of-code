import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//input number
		long n=sc.nextLong();
		System.out.println(closetIntegerWithSameWeight(n));
	}
	public static long closetIntegerWithSameWeight(long n){
	    //out idea====>>>> we have to swap rightmost bits which differs
	    final int NUM_UNSIGN_BITS=63;
	    for(int i=0;i<NUM_UNSIGN_BITS-1;i++){
	        if(((n>>>i)&1)!=((n>>>(i+1))&1)){
	            n^=(1L<<i)|(1L<<(i+1));// swaping bit i and i+1
	            return n;
	        }
	    }
	    //throw error if all bits are 0 or 1
	    throw new IllegalArgumentException("All bits are 0 or 1");
	}
}


//input 
// 7(111)
//output
// 11(1011)
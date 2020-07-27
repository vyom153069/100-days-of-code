import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//input number
		long n=sc.nextLong();
		//input positions
		int i=sc.nextInt();
		int j=sc.nextInt();
		System.out.println(swapBits(n,i,j));
	}
	public static long swapBits(long num,int i,int j){
	    //check bit on ith position and jth position are same or diffrante
	    //if diffrante then swap
	    if(((num>>>i)&1)!=((num>>>j)&1)){
	      num^=((1L<<i)|(1L<<j));  
	    }
	    //else nothing
	    return num;
	}
}


//input
/*
   32 => 100000
   0 5
*/
//output
/*
  1=>000001
*/
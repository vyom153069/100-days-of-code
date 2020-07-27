import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//input number
		long x=sc.nextLong();
		parity(x);
	}
	public static void parity(long x){
	    /*
	    short result=0;
	    while(x!=0){
	        result^=1;//toggling the result
	        x&=(x-1);//drops the lowest set bit
	    }
	    if(result==0)System.out.println("Even parity");
	    else System.out.println("Odd parity");
	    */
	    
	    //best o(1)
	    if(Long.bitCount(x)%2==0)System.out.println("Even parity");
	    else System.out.println("Odd parity");
	}
	
}
//input 
// 11                      10
//output
// odd parity               even parity
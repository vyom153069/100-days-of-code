import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//input number
        int n=sc.nextInt();
        System.out.println(swap(n));
	}
	public static int swap(int n){
        int ev=n & 0xAAAAAAAA; //10101010101010101010101010101010 in binary. We get even bits set if they were in n
	    int od=n & 0x55555555; //01010101010101010101010101010101 in binary. We get odd bits set if they were in n
	    ev>>=1;// Right Shift the evn obtained previously by 1 positions and store it in evn
	    od<<=1;// Left Shift the od obtained previously by 1 positions and store it in odd
	    return (ev | od); //Do bitwise OR of evn and od to get the final result
	}
	
}

/*
Input: N = 23
Output: 43

Input: N = 2
Output: 1
*/
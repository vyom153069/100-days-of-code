import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
        int[] a=new int[n];
        //input array
	    for(int i=0;i<n;i++)a[i]=sc.nextInt();
	    System.out.println(maxCircularSum(a));
    }
    //actual method
	public static int maxCircularSum(int[] a){
	    int max_kadane=kadane(a);
	    int max_wrap=0;
	    for(int i=0;i<a.length;i++){
	        max_wrap+=a[i];
	        a[i]=-1*a[i];
	    }
	    max_wrap+=kadane(a);
	    return Math.max(max_wrap,max_kadane);
    }
    
    //helper method which is kadane algorithm
	public static int kadane(int[] a){
	    int max_so_far=0,max_ending_here=0;
	    for(int i=0;i<a.length;i++){
	      max_ending_here+=a[i];
	      if(max_ending_here<0)max_ending_here=0;
	      max_so_far=Math.max(max_so_far,max_ending_here);
	    }
	    return max_so_far;
	}
}

// input 
/*
    7
    8 -8 9 -9 10 -11 12
*/
//output
/*
   22
*/

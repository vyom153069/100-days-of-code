import java.util.*;
public class Main
{
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //input array size
	    int n=sc.nextInt();
        int[] a=new int[n];
        //input array
	    for(int i=0;i<n;i++)a[i]=sc.nextInt();
	    int sum=sc.nextInt();
	    subarrayWithGivenSum(a,sum);
	}
	public static int subarrayWithGivenSum(int[] a,int sum){
	    int curr_sum=a[0];
        int start=0;
        //take countinous sum , when it goes out of the sum then remove elements from starting
	    for(int i=1;i<=a.length;i++){
	        while(curr_sum>sum&&start<i-1){
	            curr_sum=curr_sum-a[start];
	            start++;
	        }
	        if(curr_sum==sum){
	            int p=i-1;
	            System.out.println("Sum found"+"\n"+"from index "+start+" to "+p);
	            return 1;
	        }
	        if(i<a.length)curr_sum+=a[i];
	    }
	    System.out.println("No sum found");
	    return -1;
	}
	
}


//input 
/* 
   7
   1 4 20 3 10 5
   33
*/
//output 
/*
  sum found from index 2 to 4
*/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //input size of array
        int n=sc.nextInt();
        int[] arr=new int[n];
        //input array
        for(int i=0;i<n;i++)arr[i]=sc.nextInt();
        //print ans
	    System.out.println(maxWater(arr));
	}
	public static int maxWater(int[] arr){
	    int[] left=new int[arr.length];
	    int[] right=new int[arr.length];
	    int water=0;
        left[0]=arr[0];
        //build left array
        for(int i=1;i<arr.length;i++)left[i]=Math.max(left[i-1],arr[i]);
        right[arr.length-1]=arr[arr.length-1];
        //build right array
        for(int i=arr.length-2;i>=0;i--)right[i]=Math.max(right[i+1],arr[i]);
        //take min of both - arr[i]
	    for(int i=0;i<arr.length;i++)water+=Math.min(left[i],right[i])-arr[i];
	    return water;
	}
	
}

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//input array size
		int n=sc.nextInt();
		//input array elements
		int[] a=new int[n];
		for(int i=0;i<a.length;i++)a[i]=sc.nextInt();
		System.out.println(maxSumIS(a));
	}
	public static int maxSumIS(int[] a){
	    int max=0;
	    int n=a.length;
	    int[] dp=new int[n];
	    for(int i=0;i<n;i++)dp[i]=a[i];
	    for(int i=1;i<n;i++){
	        for(int j=0;j<i;j++){
	            if(a[i]>a[j]&&dp[i]<dp[j]+a[i])
	                dp[i]=dp[j]+a[i];
	        }
	    }
	    for(int i=0;i<n;i++)max=Math.max(max,dp[i]);
	    return max;
	}
}

//input
//7
//1 101 2 3 100 4 5
//output
//106



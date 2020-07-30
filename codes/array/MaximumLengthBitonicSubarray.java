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
        System.out.println(MaxLenBitonicSubarray(a));
    }
    public static int MaxLenBitonicSubarray(int[] a){
        int n=a.length;
        int max=Integer.MIN_VALUE;
        int[] inc=new int[n];
        int[] dec=new int[n];
        inc[0]=1;
        dec[n-1]=1;
        for(int i=1;i<n;i++)inc[i]=(a[i]>=a[i-1])?inc[i-1]+1:1;
        for(int i=n-2;i>=0;i--)dec[i]=(a[i]>=a[i+1])?dec[i+1]+1:1;
        for(int i=0;i<n;i++)max=Math.max(inc[i]+dec[i]-1,max);
        return max;
    }
}
//input
//6
//12 4 78 90 45 23

//output
//5



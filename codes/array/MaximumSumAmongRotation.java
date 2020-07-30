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
		System.out.println(maxSumAmongRotation(a));
	}
	public static int maxSumAmongRotation(int[] a){
        int sum=0;
        for(int i=0;i<a.length;i++)sum+=a[i];
        int curr_val=0;
        for(int i=0;i<a.length;i++)curr_val+=i*a[i];
        int result=curr_val;
        for(int i=1;i<a.length;i++){
            int next_val=curr_val-(sum-a[i-1])+a[i-1]*(a.length-1);
            curr_val=next_val;
            result=Math.max(result,next_val);
        }
        return result;
	}
}
//input
//4
//8 3 1 2
//output
//29



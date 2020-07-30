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
        System.out.println(MaxProductSub(a));
    }
    public static int MaxProductSub(int[] a){
        int n=a.length,max_ending=1,min_ending=1,flag=0;
        int max=1;
        for(int i=0;i<n;i++){
            if(a[i]>0){
                max_ending=max_ending*a[i];
                min_ending=Math.min(min_ending*a[i],1);
                flag=1;
            }else if(a[i]==0){
                max_ending=1;
                min_ending=1;
            }else{
                int temp=max_ending;
                max_ending=Math.max(min_ending*a[i],1);
                min_ending=temp*a[i];
            }
            max=Math.max(max_ending,max);
        }
        if(flag==0&&max==1)return 0;
        return max;
    }
}
//input
//7
//1 -2 -3 0 7 -8 -2
//output
//112



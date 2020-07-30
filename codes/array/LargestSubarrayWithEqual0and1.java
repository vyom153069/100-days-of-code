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
        System.out.println(MaxLen(a));
    }
    public static int MaxLen(int[] a){
        int n=a.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0,max_len=0,ending_index=-1,start_index=0;
        for(int i=0;i<n;i++)a[i]=(a[i]==0)?-1:1;
        for(int i=0;i<n;i++){
            sum+=a[i];
            if(sum==0){
                max_len=i+1;
                ending_index=i;
            }
            if(map.containsKey(sum+n)){
                if(max_len<i-map.get(sum+n)){
                    max_len=i-map.get(sum+n);
                    ending_index=i;
                }
            }else{
                map.put(sum+n,i);
            }
        }
        int end=ending_index-max_len+1;
        System.out.println(end+" "+ending_index);
        return max_len;
    }
}

//input
//7
//1 0 0 1 0 1 1
//output
//0 5
//6



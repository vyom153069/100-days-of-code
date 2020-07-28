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
		dutchFlagPartition(a);
		for(int i:a)System.out.println(i+" ");
        System.out.println();
    }
	public static void dutchFlagPartition(int[] a){
	    int start=0,mid=0,end=a.length-1;
	    while(mid<=end){
	        if(a[mid]==0){
	            //swap a[mid] and a[start] , increment mid and start
	            a[mid]=a[mid]+a[start]-(a[start]=a[mid]);
	            start++;
	            mid++;
	        }else if(a[mid]==1){
	            //only increment mid
	            mid++;
	        }else{
	            //swap a[mid] and a[end] and decrement mid
	            a[mid]=a[mid]+a[end]-(a[end]=a[mid]);
	            end--;
	        }
	    }
	}
}

/*
//input
12
0 1 1 0 1 2 1 2 0 0 0 1
//output
0 0 0 0 0 1 1 1 1 1 2 2 
*/
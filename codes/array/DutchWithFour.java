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
		dutchFlagFourPartition(a);
		for(int i:a)System.out.print(i+" ");
        System.out.println();
    }
	public static void dutchFlagFourPartition(int[] a){
         int start=0,end=a.length-1;
         //it will sort first 1 and 4 then 2 and 3
	    for(int bottomband=1,topband=4;topband>bottomband;bottomband++,topband--){
            //checking 1 and 4 are on correct position or not ,if they are on correct position then move 
	        while(a[start]==bottomband)start++;
            while(a[end]==topband)end--;
            //now in subarray we are arranging 1 and 4 on correct position using dutch nation stratagy
	        int i=start;
	        while(i<=end){
	            if(a[i]==bottomband){
	                a[i]=a[i]+a[start]-(a[start]=a[i]);
	                i++;
	                start++;
	                while(a[start]==bottomband)start++;
	            }else if(a[i]==topband){
	                a[i]=a[i]+a[end]-(a[end]=a[i]);
	                end--;
	                while(a[end]==topband)end--;
	            }else{
	                i++;
	            }
	        }
	    }
	    
	}
}

/*

//input
10
1 2 3 4 3 1 2 3 3 4

//output
1 1 2 2 3 3 3 3 4 4 




*/


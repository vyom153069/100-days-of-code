import java.util.*;
public class Main
{
   
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//input array size
		int n=sc.nextInt();
		int[] a=new int[n];
		//input main array
		for(int i=0;i<n;i++)a[i]=sc.nextInt();
		int[] ans=compute(a);
		if(ans.length==0){
		    System.out.println("No permutations, this was last permutations");
		}else{
		    for(int i:a)System.out.print(i+" ");
		    System.out.println();
		}
		
    }
    public static int[] compute(int[] a){
        //k is our pivot
        int k=a.length-2;
        //check how many elements are strictly decreasing
        while(k>=0&&a[k]>=a[k+1])k--;
        //reverse array means last permutation
        if(k==-1){
            int[] ans=new int[0];
            return ans;
        }
        for(int i=a.length-1;i>k;i--){
            //swap element which is bigger then pivot
            if(a[i]>a[k]){
                a[i]=a[i]+a[k]-(a[k]=a[i]);
                break;
            }
        }
        //if no element is bigger then pivot then we will reverse strictly dec section
        reverse(a,k+1,a.length);
        return a;
    }
    public static void reverse(int[] a,int start,int end){
        int i=start;
        int j=end-1;
        while(i<=j){
            a[i]=a[i]+a[j]-(a[j]=a[i]);
            i++;
            j--;
        }
    }
	
}

/*
//input
3
3 2 1
//output
No permutation, this was last

//input
7
6 2 1 5 4 3 0
//output
6 2 3 0 1 4 5 

*/
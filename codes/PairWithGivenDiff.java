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
        //input diffrence
	    int diff=sc.nextInt();
	    findPair(a,diff);
    }
    //based on two pointer approch
	public static boolean findPair(int[] a,int diff){
	    int i=0,j=1;
	    while(i<a.length&&j<a.length){
	        if(i!=j&&a[j]-a[i]==diff){
	            System.out.println(a[j]+"-"+a[i]+"="+diff);
	            return true;
	        }
	        else if(a[j]-a[i]<diff)j++;
	        else i++;
	    }
	    System.out.println("No such pair found");
	    return false;
	}
	
}
//input 
/*
   5
   1 8 30 40 100
   60
*/
//output
/*
   100-40=60
*/
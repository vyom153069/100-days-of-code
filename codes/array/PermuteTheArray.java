import java.util.*;
public class Main
{
   
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//input array size
		int n=sc.nextInt();
		int[] a=new int[n];
		int[] p=new int[n];
		//input main array
		for(int i=0;i<n;i++)a[i]=sc.nextInt();
		//input permuation array
		for(int i=0;i<n;i++)p[i]=sc.nextInt();
        applyPermutations(a,p);
        //print array elements
		for(int i:a)System.out.print(i+" ");
		System.out.println();
    }
    public static void applyPermutations(int[] a,int[] p){
        for(int i=0;i<a.length;i++){
            int next=i;
            while(p[next]>=0){
                //swap a[i] and a[p[next]
                a[i]=a[i]+a[p[next]]-(a[p[next]]=a[i]);
                int temp=p[next];
                p[next]=p[next]-p.length;
                next=temp;
            }
        }
        //restore array p
        for(int i=0;i<p.length;i++)p[i]=p[i]+p.length;
    }
	
}



/*
//input
4
11 32 3 42
2 3 0 1
//output
3 42 11 32 
*/
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
		System.out.println(advancing(a));
    }
    public static boolean advancing(int[] a){
        int furtherReachSoFar=0,lastIndex=a.length-1;
        for(int i=0;i<=furtherReachSoFar&&furtherReachSoFar<lastIndex;i++){
            furtherReachSoFar=Math.max(furtherReachSoFar,i+a[i]);
        }
        return furtherReachSoFar>=lastIndex;
    }
	
}

/*
//input
7
3 3 1 0 2 0 1
//output
true

//input
7
3 2 0 0 2 0 1
//output
false







*/
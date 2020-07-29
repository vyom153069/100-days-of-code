import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println(computeCol(s.toUpperCase()));
	}
	public static int computeCol(String s){
	    int result=0;
	    for(int i=0;i<s.length();i++){
	        char c=s.charAt(i);
	        result=result*26+c-'A'+1;
	    }
	    return result;
	}
}

//input A, output 1
//input AA, output 27
//input AAB , output 704
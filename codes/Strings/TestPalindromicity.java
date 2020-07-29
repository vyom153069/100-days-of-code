import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		
		System.out.println(isPalindrome(s));
	}
	public static boolean isPalindrome(String s){
	    int i=0,j=s.length()-1;
	    while(i<j){
	        while(!Character.isLetterOrDigit(s.charAt(i))&&i<j)i++;
	        while(!Character.isLetterOrDigit(s.charAt(j))&&i<j)j--;
	        if(Character.toLowerCase(s.charAt(i++))!=Character.toLowerCase(s.charAt(j--)))return false;
	    }
	    return true;
	}
}

//input == A man , a plan , a canal , Panama. output true 
//input == Able was I,ere I saw Elba!         output true
//input == Ray a Ray                          output false 
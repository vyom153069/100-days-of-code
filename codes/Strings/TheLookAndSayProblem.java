import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(lookAndSay(n));
	}
	public static String lookAndSay(int n){
	    String s="1";
	    for(int i=1;i<n;i++){
	        s=nextNumber(s);
	    }
	    return s;
	}
	public static String nextNumber(String s){
	    StringBuilder result=new StringBuilder();
	    for(int i=0;i<s.length();i++){
	        int count=1;
	        while(i+1<s.length()&&s.charAt(i)==s.charAt(i+1)){
	            i++;
	            count++;
	        }
	        result.append(count);
	        result.append(s.charAt(i));
	    }
	    return result.toString();
	}
}

//input 1=>1
//input 2=>11
//input 3=>1211
//input 4=>111221
//input 5=>312211
//input 6=>13112221
//input 7=>1113213211
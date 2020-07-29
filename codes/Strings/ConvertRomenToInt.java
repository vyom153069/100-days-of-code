import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println(convertROMtoInt(s));
	}
	public static int convertROMtoInt(String s){
	    Map<Character,Integer> T=new HashMap<Character,Integer>(){
	        {
	        put('I',1);
	        put('V',5);
	        put('X',10);
	        put('L',50);
	        put('C',100);
	        put('D',500);
	        put('M',1000);
	       }
	    };
	    int sum=T.get(s.charAt(s.length()-1));
	    for(int i=s.length()-2;i>=0;i--){
	        if(T.get(s.charAt(i))<T.get(s.charAt(i+1)))sum-=T.get(s.charAt(i));
	        else sum+=T.get(s.charAt(i));
	    }
	    return sum;
	}
}

//input LXI=>59
//input IC=>99
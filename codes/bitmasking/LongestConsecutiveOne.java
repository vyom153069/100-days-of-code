import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//input number
        int n=sc.nextInt();
        System.out.println(consecutive(n));
	}
	public static int consecutive(int n){
        int count = 0;
        while (x!=0) {
            x = (x & (x << 1));
            count++;
        }
        return count;
	}
	
}
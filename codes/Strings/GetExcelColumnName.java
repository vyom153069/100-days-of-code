import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(GetExcelColumnName(n));
	}
	public static String GetExcelColumnName(int columnNumber){
        int dividend = columnNumber;
        String columnName = "";
        int modulo;
        while (dividend > 0){
            modulo = (dividend - 1) % 26;
            columnName = (char)(65 + modulo) + columnName;
            dividend = (int)((dividend - modulo) / 26);
        } 
        return columnName;
    }
}
//input 4 output DD
//input 27 output AA
//input 702 output ZZ
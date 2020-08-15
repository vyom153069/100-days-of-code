import java.util.*;

public class PathThroughGraph {

  ///////////////////////////////////////////////////////////////
  
  //String pair

  //   static int ans = 0;
  // public static void main (String[]args){
  //   Scanner sc = new Scanner (System.in);
  //   int n = sc.nextInt ();
  //   int[] arr = new int[n];
  //   for (int i=0; i<n;i++)arr[i] = sc.nextInt ();

  //     String[] digits =
  //   {
  //   "zero", "one", "two", "three", "four", "five", "six", "seven", "eight",
  // "nine", "ten", "eleven", "twelve", "thirteen", "fourteen",
  // "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty",
  // "twentyone", "twentytwo", "twentythree", "twentyfour", "twentyfive",
  // "twentysix", "twentyseven", "twentyeight", "twentynine", "thirty",
  // "thirtyone", "thirtytwo", "thirtythree", "thirtyfour", "thirtyfive",
  // "thirtysix", "thirtyseven", "thirtyeight", "thirtynine", "forty",
  // "fortyone", "fortytwo", "fortythree", "fortyfour", "fortyfive",
  // "fortysix", "fortyseven", "fortyeight", "fortynine", "fifty",
  // "fiftyone", "fiftytwo", "fiftythree", "fiftyfour", "fiftyfive",
  // "fiftysix", "fiftyseven", "fiftyeight", "fiftynine", "sixty",
  // "sixtyone", "sixtytwo", "sixtythree", "sixtyfour", "sixtyfive",
  // "sixtysix", "sixtyseven", "sixtyeight", "sixtynine", "seventy",
  // "seventyone", "seventytwo", "seventythree", "seventyfour",
  // "seventyfive", "seventysix", "seventyseven", "seventyeight",
  // "seventynine", "eighty", "eightyone", "eightytwo", "eightythree",
  // "eightyfour", "eightyfive", "eightysix", "eightyseven",
  // "eightyeight", "eightynine", "ninety", "ninetyone", "ninetytwo",
  // "ninetythree", "ninetyfour", "ninetyfive", "ninetysix",
  // "ninetyseven", "ninetyeight", "ninetynine", "hundred"};
  //   int count = 0;
    
  //   for (int i = 0; i < n; i++){
  //   String st = digits[arr[i]];
  //   for (int j = 0; j < st.length(); j++){
  //       if((st.charAt(j) == 'a')||(st.charAt(j) == 'e')||(st.charAt(j) =='i')||(st.charAt(j) == 'o')||(st.charAt(j)=='u'))count++;
  //    }
  //   }
  //   if(count>100){
  //     System.out.println("greater 100");
  //   }else{
  //   for(int i=0;i<arr.length;i++){
  //     for(int j=i+1;j<arr.length;j++){
  //       if(arr[i]+arr[j]==count){
  //         ans++;
  //       }
  //     }
  //   }
  //   System.out.println (digits[ans]);
  //   }
  // }

    
  //string merge
//    public static void main(String[] args){
//    Scanner sc=new Scanner(System.in);
//    String s=sc.nextLine();
//    int n=sc.nextInt();
//    boolean ans=true;
//   
//    for(int i=0;i<n;i++){
//      String check=sc.next();
//      ArrayList<String> al=getPermutation(check);
//      boolean present=false;
//      for(String j:al){
//          if(s.indexOf(j)!=-1){
//              present=true;
//          }
//      }
//      if(present==false){
//          ans=false;
//      }
//    }
//   if(ans)System.out.println("YES");
//   else System.out.println("NO");
//  }
//public static ArrayList<String> getPermutation(String str){ 
//        if (str.length() == 0) { 
//            ArrayList<String> empty = new ArrayList<>(); 
//            empty.add(""); 
//            return empty; 
//        } 
//        char ch = str.charAt(0); 
//        String subStr = str.substring(1); 
//        ArrayList<String> prevResult = getPermutation(subStr); 
//        ArrayList<String> Res = new ArrayList<>(); 
//        for (String val : prevResult) { 
//            for (int i = 0; i <= val.length(); i++) { 
//                Res.add(val.substring(0, i) + ch + val.substring(i)); 
//            } 
//        } 
//        return Res; 
//   } 

/////////////////////////////////////////////////////////////////////////////////////////


// path through graph    
//     public static void main(String[] args){
//    Scanner sc=new Scanner(System.in);
//    int x=sc.nextInt();
//    int y=sc.nextInt();
//    
//    if(x==y){
//      System.out.println(0);
//      return;
//    }
//    HashMap<Integer,Integer> map=new HashMap<>();
//    int count=0;
//    while(x!=1){
//      x=factor(x);
//      count++;
//      map.put(x,count); 
//    }
//    count=0;
//    while(!(map.containsKey(y))){
//        count++;
//        y=factor(y);  
//     }
//    
//    System.out.println(count+map.get(y));
//  }
//  public static int factor(int x){
//    for(int i=2;i*i<x;i++){
//      if(x%i==0)
//        return x/i;
//    }
//    return 1; 
//  }
//  
//    //3 palindrome
//  public static void main(String[] args){
//    Scanner sc=new Scanner(System.in);
//    String s=sc.nextLine();
//    for(int i=1;i<s.length()-2;i++){
//      if(isPalindrome(s.substring(0,i))){
//        for(int j=i+1;j<s.length();j++){
//          if(isPalindrome(s.substring(i,j))&&isPalindrome(s.substring(j))){
//            System.out.println(s.substring(0,i));
//            System.out.println(s.substring(i,j));
//            System.out.println(s.substring(j));
//            return;
//          }
//        }
//      }
//    }
//  }
//  public static boolean isPalindrome(String s){
//    int n=s.length();
//    if(n==1)return true;
//    for(int i=0;i<=n/2;i++){
//      if(s.charAt(i)!=s.charAt(n-i-1))return false;
//    }
//    return true;
//  }


//binary equalent

//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        int one = sc.nextInt();
//        int two = sc.nextInt();
//        if (one < two) {
//            one = one + two - (two = one);
//        }
//        if (one == two) {
//            System.out.println("0");
//            return;
//        }
//        TreeMap<Integer, Integer> map = new TreeMap<>();
//
//        int c = 0;
//        while (one != 1) {
//            c++;
//            one = get(one);
//            map.put(one, c);
//        }
//
//        c = 0;
//        while (map.containsKey(two)) {
//            c++;
//            two = get(two);
//        }
//        System.out.println(c + map.getOrDefault(two,0));
//    }
//
//    public static int get(int x) {
//        for (int i = 2; i * i <= x; i++) {
//            if (x % i == 0) {
//                return x / i;
//            }
//        }
//        return 1;
//    }


}

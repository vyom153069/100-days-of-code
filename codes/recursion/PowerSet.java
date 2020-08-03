class LexSort
{
    static ArrayList<String> ans = new ArrayList<>();
    public static ArrayList<String> powerSet(String s)
    {
        ans = new ArrayList<String>();
        powerSetUtil(s, ans, 0, "");
        return ans;
    }
    // str : Stores input string
    // curr : Stores current subset
    // index : Index in current subset, curr
    static void powerSetUtil(String str, ArrayList<String> v, int index, String curr)
    {
    int n = str.length();
    
    // base case
    if (index == n)
    {
       v.add(curr);    
       return;
    }   

    // Two cases : Do not include str[index]
    //             Include str[index]    
    powerSetUtil(str, v, index+1, curr);
    powerSetUtil(str, v, index+1, curr+str.charAt(index));
    }
}



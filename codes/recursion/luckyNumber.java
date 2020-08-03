class Solution
{
    static int counter = 2;
    
    // static boolean flag = false;
    public static boolean isLucky(int n)
    {
       
        // variable next_position is just for readability of 
        // the program we can remove it and use n only  
        int next_position = n; 
        if(counter > n) 
            return true; 
        if(n%counter == 0) 
            return false;       
   
        // calculate next position of input no 
        next_position -= next_position/counter; 
     
        counter++; 
        return isLucky(next_position);
           
    }
    
}


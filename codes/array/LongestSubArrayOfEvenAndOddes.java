class LongSubOfEvenOdd
{
    public static int maxEvenOdd(int arr[], int n)
    {
        int curr_max = 1;
        int max_so_far = 1;
        
        for(int i = 1; i < n; i++)
        {
            if((arr[i-1]%2 == 0 && arr[i]%2 != 0) || 
                    (arr[i-1]%2 != 0 && arr[i]%2 == 0))
            {
                curr_max++;
                max_so_far = Math.max(curr_max, max_so_far);
            }
            else curr_max = 1;
        }
        return max_so_far;
    }
}


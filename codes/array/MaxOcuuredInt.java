class MaxOccur{
    public static int maxOccured(int L[], int R[], int n, int maxx){
        
        int arr[] = new int[100000];
        
        for(int i = 0;i<n;i++){
            arr[L[i]] += 1;
            arr[R[i]+1] -= 1;
        }
        
        int msum = arr[0], ind = -1;
        
        for(int i = 1;i<=maxx;i++){
            arr[i] += arr[i-1];
            if(msum < arr[i]){
                msum = arr[i];
                ind = i;
            }
        }
        
        return ind;
    }
    
}


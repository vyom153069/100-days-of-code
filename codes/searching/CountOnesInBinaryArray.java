class Ones{
    
    public static int countOnes(int arr[], int n){
        
        int low = 0, high = n-1;
        
        int mid = (low+high)/2;
        
        // Binary Search
        while(low <= high){
            
            mid = (low + high)/2;
            
            // if mid is 1, then check for upper half
            if(arr[mid] == 1 && mid+1 < n && arr[mid+1] == 1){
                low = mid+1;
            }
            
            // if mid is 0, then iterate for upper half
            else if(arr[mid] == 0){
                high = mid-1;
            }
            
            // else, iterate for lower half
            else if(arr[mid] == 1 && ((mid+1 < n && arr[mid+1] == 0) || (mid == n-1))){
                return mid+1;
            }
            
        }
        return 0;
    }
    
}


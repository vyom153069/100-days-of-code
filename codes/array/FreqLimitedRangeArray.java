class Frequency{
    public static void frequencycount(int arr[], int n)
    {
        for (int j =0; j<n; j++) 
            arr[j] = arr[j]-1; 
        
        // storing the frequency of elements using mathematical formula
        for (int i=0; i<n; i++) 
            arr[arr[i]%n] = arr[arr[i]%n] + n; 

        for (int i =0; i<n; i++) 
            arr[i] = (arr[i]/n);
    }
}
//geeksforgeeks
class BubbleSort
{
	static void bubble(int arr[], int i, int n)
    {
        // iterate over elements
        for (int j = 0; j < n-i-1; j++)
        
            // swap the elements to get into correct position
            if(arr[j] > arr[j+1])
                {
                    // swap temp and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }
}
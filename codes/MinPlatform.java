import java.util.*;
public class Main
{
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //input array size
        int n=sc.nextInt();
        //input arrival array  [900 940 950 1100 1500 1800]
	    int[] arr=new int[n];
        for(int i=0;i<n;i++)arr[i]=sc.nextInt();
        //input departure array [910 1200 1120 1130 1900 2000]
	    int[] dep=new int[n];
        for(int i=0;i<n;i++)dep[i]=sc.nextInt();
        //calling function
	    System.out.println(findMinPlatform(arr,dep,n));
	}
	public static int findMinPlatform(int[] arr,int[] dep,int n){
        Arrays.sort(arr);
        //[[900 940 950 1100 1500 1800]]
        Arrays.sort(dep);
        //[910 1120 1130 1200 1900 2000]
	    int noOfPlatforms = 1;
        int index1 = 1;
        int index2 = 0;
        while (index1 < n) {
            if (arr[index1] < dep[index2]) {
                //940<910 false ,so index1=2,index2=1  ,,,
                //950<1120 true so platform=1, index1=2
                //950<1120 true so platform=2, index1=3
                //1100<1120 true so platform=3, index1=4
                //1500<1120 false index1=5,index2=2
                //1800<1130 false index1=6,index2=3
                noOfPlatforms++;
                index1++;
            } else {
                index1++;
                index2++;
            }
        }
        return noOfPlatforms;

//alternate approch
        /*
          
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<n;i++){
            if(pq.isEmpty())pq.add(i);
            else{
                if(arr[i]>dep[pq.peek()]){
                    pq.poll();
                    pq.add(i);
                }else{
                    pq.add(i);
                }
            }
        }
        return pq.size();
        
        */
    }
    
	
}
public static boolean isValid(int []a,int n,int k,int max){
        int student = 1;
        int sum = 0;
        for(int i=0;i<n;i++) {
            sum+=a[i]; 
            if(sum>max){
                student++;
                sum = a[i];
            }
        }
        if(student>k)
            return false;
        return true;
    }
    public static int findPages(int[]a,int n,int m){
        //Your code here
        int totalsum = 0;
        int start = 0;
        int res = -1;
        for(int i=0;i<n;i++) {
            start=Math.max(a[i],start);
            totalsum+= a[i];
        }
        while(start<=totalsum){
            int mid=(start+totalsum)/2;
            if(isValid(a,n,m,mid)){
                res=mid;
                totalsum=mid-1; 
            } else{ 
                start=mid+1;
            } 
        }
        return res; 
    }
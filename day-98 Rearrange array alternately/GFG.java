class Solution{
    
    // temp: input array
    // n: size of array
    //Function to rearrange  the array elements alternately.
    public static void rearrange(long arr[], int n){
        long [] nearr=arr.clone();
        int low=0;
        int high=n-1;
        boolean flag=true;
        for(int i=0;i<n;i++){
          if(flag){
              arr[i]=nearr[high--];
          }
          else{
              arr[i]=nearr[low++];
          }
          flag=!flag;
        }
        // Your code here
        
    }
    
}

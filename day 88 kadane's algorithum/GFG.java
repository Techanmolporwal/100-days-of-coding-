class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
       
        long count=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
             int sum=0;
            for(int j=i;j<n;j++){
                sum+=arr[j];
                if(count<sum){
                    count=sum;
                }
            }
        }
        // Your code here
        return count;
    }
    
}

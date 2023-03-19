class Solution{
    static int toyCount(int N, int K, int arr[])
    {
        // code here
        int sum=0;
        int count=0;
        Arrays.sort(arr);
        if(arr[0]<K){
            sum+=arr[0];
            count++;
        }
        for(int i=1;i<N;i++){
            if(sum+arr[i]<=K){
                sum+=arr[i];
                count++;
            }
        }
        
        return count;
    }
}

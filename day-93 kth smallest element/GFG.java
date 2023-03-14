class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        //Your code here
        Arrays.sort(arr);
        int ks=arr[k-1];
        return ks;
    } 
}

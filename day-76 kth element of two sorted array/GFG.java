class Solution {
    public long kthElement( int arr1[], int arr2[], int n, int m, int k) {
        int[] arr3=new int[n+m];
        for(int i=0;i<n;i++ ){
            arr3[i]=arr1[i];
        }
        for(int i=0;i<m;i++ ){
            arr3[arr1.length+i]=arr2[i];
        }
        Arrays.sort(arr3);
        long value=arr3[k-1];
        return value;
        
    }
}

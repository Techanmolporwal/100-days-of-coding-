class Solution {
  public:
    int binarysearch(int arr[], int n, int k) {
        // code here
      int lo=0;
      int hi=n-1;
      while(lo<=hi){
          int mid=(lo+hi)/2;
          if(arr[mid]==k){
              return mid;
          }
          else if(arr[mid]<k){
              lo=mid+1;
          }
          else if(arr[mid]>k){
              hi=mid-1;
          }
      }
      if(lo>hi){
          return -1;
      }
       
    }
};

class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Your code here
        int sum=0;
        int first=0;
        int last=0;
        ArrayList<Integer> arrlist = new ArrayList<Integer>();
        for(int j=0;j<n;j++){
            for(int i=j;i<n;i++){
                first=j;
                sum+=arr[i];
                if(sum==s){
                    last=i;
                    break;
                }
            }
            if(sum==s){
                    break;
                }
        }
        
           arrlist.add(last+2);
           arrlist.add(first);
           
        return arrlist;
        
    }
}

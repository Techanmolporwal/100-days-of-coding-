class Solution{
    //Function to check if two arrays are equal or not.
    public static boolean check(long A[],long B[],int N)
    {
        //Your code here
     Arrays.sort(A);  
        Arrays.sort(B);  
        
        if( Arrays.equals(A, B)){
            return true;
        }
        else{
            return false;
        }
        
    }
}

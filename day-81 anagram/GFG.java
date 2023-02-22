class Solution
{    
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a,String b)
    {
        
        // Your code here
        boolean chech=false;
        if(a.length()==b.length()){
            char[] arr1=a.toCharArray();
            char[] arr2=b.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            if(Arrays.equals(arr2,arr1)){
            chech=true;
            }
        }
        
            return chech;
    }
}

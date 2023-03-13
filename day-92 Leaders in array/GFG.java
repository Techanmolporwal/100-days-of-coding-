class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
      
        ArrayList<Integer> al = new ArrayList<Integer>();
       Stack<Integer> stack = new Stack<Integer>();
        stack.push(arr[n - 1]);
  
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= stack.peek()) {
                stack.push(arr[i]);
            }
        }
  
      
        while (!stack.empty()) {
            al.add(stack.pop());
        }
        
        return al;
        
        
    }
}

class Solution{
    public void zigZag(int a[], int n){
        // Code your solution here.
        Arrays.sort(a);
        for (int i = 1; i <= a.length - 2; i += 2) {
            int temp = a[i];
            a[i] = a[i + 1];
            a[i + 1] = temp;
        }
    }
}

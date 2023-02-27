class Solution {
    static long sumMatrix(long n, long q) {
        int n1=(int) n;
        int q1=(int)q;
        int[][] arr = new int[n1][n1];
        for(int i=0;i<n1;i++)
        {
            for(int j=0;j<n1;j++)
            {
                arr[i][j] = i+j+2;
            }
        }
        int count=0;
        for(int i=0;i<n1;i++)
        {
            for(int j=0;j<n1;j++)
            {
              if(arr[i][j]==q1){
                  count++;
              }
            }
        }
        
        
        return count;
    }
};

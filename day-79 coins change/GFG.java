class Solution {
   public long count(int coins[], int N, int sum)
    {
        long[] dp = new long[sum + 1];
        dp[0] = 1;
        for (int i : coins)
        {
            for (int j=i;j<=sum;j++)
            {
                dp[j] += dp[j-i];
            }
        }
        return dp[sum];
    }
}

class Solution {
    private int solve(int[] nums, int index, int n, int dp[]) {
        if (index > n)
            return 0;
        if (dp[index] != -1)
            return dp[index];

        int take = nums[index] + solve(nums, index + 2, n, dp);
        int not_take =  solve(nums, index + 1, n, dp);
        return dp[index] = Math.max(take, not_take);
    }

    public int rob(int[] nums) {
        int n = nums.length;

        if (n == 1)
            return nums[0];
        if (n == 2)
            return Math.max(nums[0], nums[1]);

        int dp1[] = new int[n];
        Arrays.fill(dp1, -1);
        int dp2[] = new int[n];
        Arrays.fill(dp2, -1);

        int take_0th_index_house = solve(nums, 0, n - 2, dp1); // 0 se leke n-2 tak!
        int skip_0th_index_house = solve(nums, 1, n - 1, dp2); // 1 se leke n - 1;

        return Math.max(take_0th_index_house, skip_0th_index_house);
    }
}
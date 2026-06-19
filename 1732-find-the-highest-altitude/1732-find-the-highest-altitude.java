class Solution {
    public int largestAltitude(int[] gain) {
        int ans = 0;
        int n = gain.length;
        int prefixSum = 0;
        for (int i = 0; i < n; i++) {
                prefixSum+=gain[i];
                ans = Math.max(ans,prefixSum);
        }
        return ans;
    }
}
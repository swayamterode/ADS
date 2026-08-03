class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int l = 0, r = 0, maxLen = 0;
        int[] hash = new int[256];
        Arrays.fill(hash, -1);

        while (r < n) {
            if (hash[s.charAt(r)] >= l && hash[s.charAt(r)] != -1) {
                l = Math.max(hash[s.charAt(r)] + 1, l);
            }
            maxLen = Math.max(maxLen, r - l + 1);
            hash[s.charAt(r)] = r;
            r++;
        }
        return maxLen;
    }
}
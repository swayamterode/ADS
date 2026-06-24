class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int hashLen = 256; // sare chars le liye mene

        int[] hash = new int[hashLen];
        Arrays.fill(hash, -1); // sare -1 kr diye hash array me

        int l = 0, r = 0, maxLen = 0;
        while (r < n) {
            if (hash[s.charAt(r)] >= l) {
                l = Math.max(hash[s.charAt(r)] + 1, l);
            }
            int len = r - l + 1;
            maxLen = Math.max(maxLen, len);
            hash[s.charAt(r)] = r;
            r++;
        }
        return maxLen;
    }
}
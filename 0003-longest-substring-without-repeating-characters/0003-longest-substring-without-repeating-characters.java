class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> mpp = new HashSet<>();
        int n = s.length();

        int res = 0;
        int left = 0;

        for (int right = 0; right < n; right++) {
            while (mpp.contains(s.charAt(right))) {
                mpp.remove(s.charAt(left));
                left++;
            }
            mpp.add(s.charAt(right));
            res = Math.max(res, right - left + 1);
        }
        return res;
    }
}
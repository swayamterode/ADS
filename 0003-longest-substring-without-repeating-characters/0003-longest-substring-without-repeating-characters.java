class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int res = 0;
        Map<Character, Integer> mpp = new HashMap<>();

        int start = 0;

        for(int end = 0; end < n; end++){
            char currentChar = s.charAt(end); //a
            if(mpp.containsKey(currentChar)){
                start = Math.max(start, mpp.get(currentChar) + 1);
            }
            res = Math.max(res, end - start + 1);
            mpp.put(currentChar, end);
        }
        return res;
    }
}
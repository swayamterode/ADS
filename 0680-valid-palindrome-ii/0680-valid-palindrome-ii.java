class Solution {
    private boolean checkPalindrome(int i, int j, String s) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j))
                return false;
            else {
                i++;
                j--;
            }
        }
        return true;
    }

    public boolean validPalindrome(String s) {
        int i = 0,
                j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return checkPalindrome(i + 1, j, s) || checkPalindrome(i, j - 1, s);
            } else {
                i++;
                j--;
            }
        }
        return true;
    }
}
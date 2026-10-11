class Solution {
    private void f(StringBuilder s, List<String> ans, int n) {
     if (s.length() == n) {
            ans.add(s.toString());
            return;
        }
        
        s.append('1');
        f(s, ans, n);
        s.deleteCharAt(s.length() - 1);

        if(s.length() == 0 || s.charAt(s.length() - 1) != '0'){
            s.append('0');
            f(s,ans,n);
            s.deleteCharAt(s.length() - 1);
        }
    }

    public List<String> validStrings(int n) {
        List<String> ans = new ArrayList<>();
        f(new StringBuilder(), ans, n);
        return ans;
    }
}
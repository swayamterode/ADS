class Solution {
    public boolean backspaceCompare(String s, String t) {
        return build(s).equals(build(t));
    }

    private String build(String str) {
        StringBuilder sb = new StringBuilder();

        int skipCounter = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            if(str.charAt(i) == '#'){
                skipCounter++;
            } else if(skipCounter > 0){
                skipCounter--;
            } else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
}
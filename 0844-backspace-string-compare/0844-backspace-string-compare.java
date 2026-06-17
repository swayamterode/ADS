class Solution {
    public boolean backspaceCompare(String s, String t) {
        return build(s).equals(build(t));
    }
    private String build(String str){
        Deque<Character> st = new ArrayDeque<>();

        for(char ch: str.toCharArray()){
            if(ch == '#'){
                if(!st.isEmpty()){
                    st.pop();
                }
            } else{
                st.push(ch);
            }
        }

        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.toString();
    }
}
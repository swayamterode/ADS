class Solution {
    public List<Integer> diffWaysToCompute(String s) {
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i < s.length(); i++){
            char operator = s.charAt(i); // 2-1-1 -> in one pass 2, in 2nd pass '-'
            if(operator == '+' || operator == '-' || operator == '*'){
                List<Integer> s1 = diffWaysToCompute(s.substring(0, i));
                List<Integer> s2 = diffWaysToCompute(s.substring(i+1));
                for(int a : s1){
                    for(int b : s2){
                        if(operator == '+') res.add(a + b);
                        else if(operator == '-') res.add(a - b);
                        else if(operator == '*') res.add(a * b);
                    }
                }
            }
        }
        if(res.isEmpty()){
            res.add(Integer.parseInt(s));
        }
        return res;
    }
}
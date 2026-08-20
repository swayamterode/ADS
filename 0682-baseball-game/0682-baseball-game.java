class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        int score = 0;
        for (String str : operations) {
            if (!str.equals("C") && !str.equals("D") && !str.equals("+")) {
                int x = Integer.parseInt(str);
                st.push(x);
                score += x;
            } else if (str.equals("C")) {
                score -= st.pop();
            } else if (str.equals("D")) {
                int d = 2 * st.peek();
                st.push(d);
                score += d;
            } else { // "+"
                int firstElement = st.pop();
                int secondElement = st.peek();
                int sum = firstElement + secondElement;
                st.push(firstElement);
                st.push(sum);
                score += sum;
            }
        }
        return score;
    }
}
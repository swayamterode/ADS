class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        HashSet<Integer> prefixSet = new HashSet<>();
        int count = 0;
        for (int num : arr1) {
            while (num > 0) {
                prefixSet.add(num);
                num /= 10;
            }
        }
        for (int num : arr2) {
            while (num > 0) {
                if (prefixSet.contains(num)) {
                    int prefixLength = String.valueOf(num).length();
                    count = Math.max(prefixLength, count);
                    break;
                }
                num /= 10;
            }
        }
        return count;
    }
}
class Solution {
    public int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[right]) {
                // minimum right side mein hai, mid exclude ho sakta hai
                left = mid + 1;
            } else {
                // minimum mid ya usse left side mein hai, mid include karo
                right = mid;
            }
        }

        return nums[left];
    }
}
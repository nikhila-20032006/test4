class Solution {
    public int singleNumber(int[] nums) {
        int count = 0;
        int left = 0;

        while (left < nums.length) {
            count = count ^ nums[left];
            left++;
        }

        return count;
    }
}

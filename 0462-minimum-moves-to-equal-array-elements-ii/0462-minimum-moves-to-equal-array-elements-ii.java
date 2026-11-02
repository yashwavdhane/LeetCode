
class Solution {
    public int minMoves2(int[] nums) {
        int median;
        int moves = 0;
        int l = nums.length;

        Arrays.sort(nums);

        median = nums[l / 2];

        for (int i : nums) {
            moves += Math.abs(i - median);
        }

        return moves;
    }
}

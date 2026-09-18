class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int ans[] = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            ans[i]=nums[i];
        }
        int start = nums.length - k;
        int j=0;
        for(int i=start; i<nums.length; i++){
            nums[j]=ans[i];
            j++;
        }
        for(int i=0; i<start; i++){
            nums[j]=ans[i];
            j++;
        }
    }
}
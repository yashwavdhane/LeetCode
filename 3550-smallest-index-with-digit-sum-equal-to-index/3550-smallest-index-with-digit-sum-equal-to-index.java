class Solution {
    public int smallestIndex(int[] nums) {
        int sum=0;
        for(int i=0; i<nums.length; i++){
            int a = nums[i];
            sum=0;
            while(a>0){
                int b = a %10;
                sum += b;
                a/=10;
            }
            if (sum==i){
                return i;
            }
        }
        return -1;
    }
}
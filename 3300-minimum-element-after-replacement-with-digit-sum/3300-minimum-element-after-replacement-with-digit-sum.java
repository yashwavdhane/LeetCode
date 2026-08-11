class Solution {
    public int minElement(int[] nums) {
        for(int i=0; i<nums.length; i++){
            int x = nums[i];
            int p =0;
            while(x>0){
                int s = x % 10;
                p+= s;
                x /=10;
            }
            nums[i]=p;
        }
        int min = nums[0];
        for(int i=1; i<nums.length; i++){
            if(nums[i]<min){
                min=nums[i];
            }
        }
        return min;
    }
}
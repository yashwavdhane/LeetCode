class Solution {
    public int countPartitions(int[] nums) {
        int a=0;
        int count=0;
        while(a<=nums.length-2){
            int sum1 =0;
            int sum2 =0;
            for(int i=0; i<=a; i++){
                sum1+=nums[i];
            }
            for(int i=a+1; i<nums.length; i++){
                sum2+=nums[i];
            }
            int diff = Math.abs(sum1-sum2);
            if(diff%2==0){
                count++;
            }
            a++;
        }
        return count;
    }
}
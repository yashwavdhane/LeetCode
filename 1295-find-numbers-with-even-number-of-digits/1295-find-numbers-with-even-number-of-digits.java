class Solution {
    public int findNumbers(int[] nums) {
        int even = 0;
        for(int a:nums){
            int count = 0;
            while(a>0){
                count++;
                a /=10;
            }
            if(count%2==0){
                even++;
            }
        }
        return even;
    }
}
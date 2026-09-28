class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        short count=0;
        for(int n:nums){
            while(n>0){
                int a = n%10;
                if(a==digit){
                    count++;
                }
                n = n/10;
            }
        }
        return count;
    }
}
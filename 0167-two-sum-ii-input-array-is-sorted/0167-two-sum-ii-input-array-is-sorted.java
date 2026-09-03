class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length - 1;
        int total =0;
        while(l<r){
            total = numbers[l]+numbers[r];
            if(target==total){
               return new int[] {l+1, r+1};
            } else if(total>target){
                r--;
            } else {
                l++;
            }
        }
        return new int[] {l, r};
    }
}
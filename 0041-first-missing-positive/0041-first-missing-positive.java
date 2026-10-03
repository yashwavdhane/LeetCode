class Solution {
    public int firstMissingPositive(int[] nums) {
        if(nums.length==0){
            return 1;
        }
        HashSet<Integer> n = new HashSet<>();
        for(int i:nums){
            n.add(i);
        }
        for(int i=1; i<nums.length+1; i++){
            if(!n.contains(i)){
                return i;
            }
        }
        return nums.length+1;
    }
}
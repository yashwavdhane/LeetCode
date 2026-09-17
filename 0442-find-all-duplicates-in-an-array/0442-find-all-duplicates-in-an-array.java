class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> duplicates = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int x: nums){
            if(set.contains(x)){
                duplicates.add(x);
            } else{
                set.add(x);
            }
        }
        return duplicates;
    }
}
class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> n= new ArrayList<>();
        for(int i:nums){
            String s = Integer.toString(i);
            for(int x=0; x<s.length(); x++){
                n.add(s.charAt(x)-'0');
            }
        }
        int result[] = new int[n.size()];
        for(int i=0; i<result.length; i++){
            result[i]=n.get(i);
        }
        return result;
    }
}
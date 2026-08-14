class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int m =0;
        for(int num : candies){
            m = Math.max(m,num);
        }
        List<Boolean> boolList = new ArrayList<>();
        for(int n: candies){
            int sum=0;
            sum+= (n+extraCandies);
            if(sum>=m){
                boolList.add(true);
            } else{
                boolList.add(false);
            }
        }
        return boolList;
    }
}
class Solution {
    public int calculateScore(int a, int b) {
        String one = Integer.toBinaryString(a);
        String two = Integer.toBinaryString(b);
        int count1=0;
        for(int i=0; i<one.length(); i++){
            if(one.charAt(i)=='1'){
                count1++;
            }
        }
        int count2=0;
        for(int i=0; i<two.length(); i++){
            if(two.charAt(i)=='1'){
                count2++;
            }
        }
        if(count1>=count2){
            return count2 * count1 ;
        }
        return count2/count1 ;
    }
}
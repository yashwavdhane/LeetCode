class Solution {
    public int reverseDegree(String s) {
        int product =0;
        for(int i=0; i<s.length(); i++){
            int a = 123 - (int) s.charAt(i) ;
            product += a*(i+1);
        }
        return product;
    }
}
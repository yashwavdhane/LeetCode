class Solution {
    public String reversePrefix(String s, int k) {
        String rev ="";
        for (int i = k-1; i>=0; i--) {
            rev += s.charAt(i); 
        }
        for(int j=k; j<s.length(); j++){
            rev += s.charAt(j);
        }
        return rev;
    }
}
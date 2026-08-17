class Solution {
    public boolean rotateString(String s, String goal) {
        String a = "";
        for(int i=0; i<s.length(); i++){
            a += s.charAt(i);
            String b = s.substring(i+1) + a;
            if (b.equals(goal)){
                return true;
            }
        }
        return false;
    }
}

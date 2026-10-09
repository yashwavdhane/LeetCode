class Solution {
    public int minInsertions(String s) {
        int o = 0;
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                if (o % 2 != 0) {
                    c++;
                    o--;
                }
                o += 2;
            } else {
                o--;

                if (o < 0) {
                    c++;
                    o = 1;
                }
            }
        }
        return c + o;
    }
}

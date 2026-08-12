class Solution {
    public int maxFreqSum(String s) {
        int freq[] = new int[26];
        for(char ch : s.toCharArray()){
            freq[ch - 'a']++;
        }
        int vowel =0;
        int conso =0;
        for(int i=0; i<26; i++){
            char ch = (char)(i+'a');
            if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'){
                vowel = Math.max(vowel,freq[i]);
            } else {
                conso = Math.max(conso,freq[i]);
            }
        }
        return vowel+conso;
    }
}
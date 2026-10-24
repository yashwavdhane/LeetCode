class Solution {
    public int[] findArray(int[] pref) {
        int arr[] = new int [pref.length];
        for(int i=0; i<arr.length; i++){
            if(i==0){
                arr[i]=pref[i];
            } else {
                arr[i] = pref[i - 1] ^ pref[i];
            }
        }
        return arr;
    }
}
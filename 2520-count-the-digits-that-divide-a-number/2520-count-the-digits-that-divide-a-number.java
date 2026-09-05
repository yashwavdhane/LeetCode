class Solution {
    public int countDigits(int num) {
        int x = num;
        int count=0;
        while(num>0){
            int i=num%10;
            if(x%i==0){
                count++;
            }
            num/=10;
        }
        return count;
    }
}
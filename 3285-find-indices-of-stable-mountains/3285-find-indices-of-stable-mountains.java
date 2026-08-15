class Solution {
    public List<Integer> stableMountains(int[] height, int threshold) {
        List<Integer> ok = new ArrayList<>();
        for(int i=1; i<height.length; i++){
            if(height[i - 1] > threshold){
                ok.add(i);
            }
        }
        return ok;
    }
}
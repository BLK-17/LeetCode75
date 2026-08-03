class Solution {
    public int largestAltitude(int[] gain) {
       int alt = 0;
       int high = 0;
        for(int g : gain){
            alt += g;
            high = Math.max(high, alt);
        }
        return high;
    }
}

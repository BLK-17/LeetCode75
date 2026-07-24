class Solution {
    public boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE;
        int snd =  Integer.MAX_VALUE;
        for(int n:nums){
            if(n<=first)    first = n;
            else if(n<=snd) snd = n;
            else return true;
        }
        return false;
    }
}

class Solution {
    public int longestSubarray(int[] nums) {
        int l = 0;
        int zc = 0, maxlen = 0;
        for(int r = 0;r<nums.length;r++){
            if(nums[r]==0)
                zc++;
        while(zc>1){
            if(nums[l]==0)  zc--;
        l++;
        }
            maxlen = Math.max(maxlen, r - l);
        }
        return maxlen;
    }

}

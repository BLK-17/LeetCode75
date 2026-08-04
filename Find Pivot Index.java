class Solution {
    public int pivotIndex(int[] nums) {
        //int n = nums.length;
        int ttl = 0;
        for(int t : nums){
            ttl += t;
        }

        int left = 0;
        for(int i=0;i<nums.length;i++){
            int right = ttl - left - nums[i];

            if(left == right){
                return i;
            } 
            left += nums[i];
        }
        return -1;
    }
}

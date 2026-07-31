class Solution {
    public void moveZeroes(int[] nums) {
        int insertpos = 0;

        for(int n:nums){
            if(n != 0)
                nums[insertpos++] = n;
        }
        while(insertpos<nums.length){
            nums[insertpos++] = 0;
        }
    }
}

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for(int i=0;i<k;i++)
            sum += nums[i];
        int str = 0, end = k;
        int maxsum = sum;
        while(end<nums.length){
            sum -= nums[str];
            str++;

            sum += nums[end];
            end++;
            maxsum = Math.max(maxsum, sum);
        }
        return (double) maxsum/k;
    }
}

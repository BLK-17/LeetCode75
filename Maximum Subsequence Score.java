class Solution {
    public long maxScore(int[] nums1, int[] nums2, int k) {
        int n = nums1.length;
        int[][] pairs = new int[n][2];
        for(int i=0;i<n;i++){
            pairs[i][0] = nums1[i];
            pairs[i][1] = nums2[i];
        }
        Arrays.sort(pairs,(a,b)->b[1]-a[1]);
        PriorityQueue<Integer> mh = new PriorityQueue<>();

        long sum = 0;
        long ans = 0;
        for(int[] p : pairs){
            int num1 = p[0];
            int num2 = p[1];

            mh.offer(num1);
            sum += num1;

            if(mh.size()>k){
                sum -= mh.poll();
            }
            if(mh.size()==k){
                ans = Math.max(ans, sum * num2);
            }
        }
        return ans;
    }
}

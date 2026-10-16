class Solution {
    public int maxProfit(int[] prices, int fee) {
        int c = 0;
        int h = -prices[0];
        for(int i=1;i<prices.length;i++){
            int oc = c;
            c = Math.max(c, h+prices[i] - fee);
            h = Math.max(h, oc - prices[i]);
        }
        return c;
    }
}

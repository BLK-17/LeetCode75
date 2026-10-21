class Solution {
    public long totalCost(int[] costs, int k, int candidates) {
        PriorityQueue<Integer> lft = new PriorityQueue<>();
        PriorityQueue<Integer> rgt = new PriorityQueue<>();

        int i = 0;
        int j = costs.length - 1;
        while (i <= j && lft.size() < candidates) {
            lft.offer(costs[i++]);
        }
        while (i <= j && rgt.size() < candidates) {
            rgt.offer(costs[j--]);
        }
        long ttl = 0;
        for(int h = 0; h < k; h++){
            if(rgt.isEmpty() ||
            (!lft.isEmpty() && lft.peek() <= rgt.peek())){
                ttl += lft.poll();
                if(i<=j){
                    lft.offer(costs[i++]);
                }
            }else{
                ttl += rgt.poll();
                if(i <= j){
                    rgt.offer(costs[j--]);
                }
            }
        }
        return ttl;
    }
}

class SmallestInfiniteSet {
    PriorityQueue<Integer> pq;
    HashSet<Integer> set;
    int nxt;

    public SmallestInfiniteSet() {
      pq = new PriorityQueue<>();
      set = new HashSet<>();
      nxt = 1;  
    }
    
    public int popSmallest() {
        if(!pq.isEmpty()){
            int num = pq.poll();
            set.remove(num);
            return num;
        }
        return nxt++;
    }

    
    public void addBack(int num) {
        if(num<nxt && !set.contains(num)){
            pq.offer(num);
            set.add(num);
        }
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */

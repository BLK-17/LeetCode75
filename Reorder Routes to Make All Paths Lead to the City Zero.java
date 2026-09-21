class Solution {
    public int minReorder(int n, int[][] connections) {
        List<int[]>[] gp = new ArrayList[n];
        for(int i=0;i<n;i++){
            gp[i] = new ArrayList<>();
        }

        for(int[] e : connections){
            int f = e[0];
            int to = e[1];
            gp[f].add(new int[]{to, 1});
            gp[to].add(new int[]{f, 0});
        }

        boolean[] v = new boolean[n];

        return dfs(0,gp,v);
    }
    private int dfs(int c, List<int[]>[] gp, boolean[] v){
        v[c] = true;

        int cg = 0;
        for(int[] e:gp[c]){
            int n = e[0];
            int ct = e[1];

            if(v[n]) continue;

            cg += ct;
            cg += dfs(n, gp, v);
        }
        return cg;
    }
}

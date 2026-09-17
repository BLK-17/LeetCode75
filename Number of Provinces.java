class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean[] vt = new boolean[n];
        int pr = 0;
        for(int i=0;i<n;i++){
            if(!vt[i]){
                pr++;

                dfs(i, isConnected, vt);
            }
        }
        return pr;
    }

    private void dfs(int c, int[][] isConnected, boolean[] vt){
        vt[c] = true;

        for(int nt = 0;nt<isConnected.length;nt++){
            if(isConnected[c][nt]==1 && !vt[nt]){
                dfs(nt, isConnected, vt);
            }
        }
    }
}

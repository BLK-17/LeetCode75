class Solution {
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        Queue<int[]>  q = new LinkedList<>();

        int f = 0;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j] == 2) q.offer(new  int[]{i, j});

                if(grid[i][j] == 1) f++;
            }
        } 
        int min = 0;
        int[][] dt  = {{1,0},{-1,0},{0,1},{0,-1}};

        while(!q.isEmpty() && f >0){
            int sz = q.size();

            for(int i=0;i<sz;i++){
                int[] curr = q.poll();
                int r = curr[0];
                int c = curr[1];
                for(int[] dir :dt){
                int nr = r+dir[0];
                int nc = c+dir[1];

                if(nr>=0 && nr<m&& nc>=0 && nc<n && grid[nr][nc] == 1){
                    grid[nr][nc] = 2;
                    f--;

                    q.offer(new int[]{nr, nc});
                }
                }
            }
            min++;
        }

        return f == 0 ? min :-1;
    }
}

class Solution {
    public int nearestExit(char[][] maze, int[] entrance) {
        int r = maze.length;
        int c = maze[0].length;

        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{
            entrance[0],entrance[1],0
        });
        maze[entrance[0]][entrance[1]] = '+';
        int[][] dst = {{-1,0},{1,0},{0,-1},{0,1}};
        while(!q.isEmpty()){
            int[] cur = q.poll();
            int rr = cur[0];
            int cc = cur[1];
            int dt= cur[2];

            for(int[] dir : dst){
                int nr = rr+dir[0];
                int nc = cc+dir[1];

                if(nr<0||nr>=r || nc < 0 || nc >= c){ continue;}
                if(maze[nr][nc] == '+'){continue;}
                maze[nr][nc] = '+';
                int nd = dt +1;
                if(nr == 0|| nr == r -1 || nc == 0 || nc == c -1){ return nd;}
            q.offer(new int[]{nr,nc,nd});
            }
        }
        return -1;
    }
}

class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] visited = new boolean[rooms.size()];
        dfs(0, rooms, visited);
        for(boolean r : visited){
            if(!r)  return false;
        }
        return true;
    }

    private void dfs(int room, List<List<Integer>> rooms, boolean[] visited){
        if(visited[room]){
            return;
        }

        visited[room] = true;

        for(int k:rooms.get(room)){
            dfs(k, rooms, visited);
        }
    }
}

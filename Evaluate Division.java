class Solution {
    Map<String, List<Edge>> graph = new HashMap();
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        for (int i = 0; i < equations.size(); i++) {
            String a = equations.get(i).get(0);
            String b = equations.get(i).get(1);

            graph.computeIfAbsent(a, k -> new ArrayList<>()).add(new Edge(b, values[i]));
            graph.computeIfAbsent(b, k -> new ArrayList<>()).add(new Edge(a, 1.0/ values[i]));
        }
        double[] ans = new double[queries.size()];
        for (int i = 0; i < queries.size(); i++) {
            String start = queries.get(i).get(0);

            String target = queries.get(i).get(1);

            ans[i] = dfs(start, target, new HashSet<>());
        }
        return ans;
    }

    private double dfs(String curr, String target, Set<String> visited) {
        if (!graph.containsKey(curr) || !graph.containsKey(target)) {
            return -1.0;
        }
            if (curr.equals(target)){
                return 1.0;}
            visited.add(curr);
            for (Edge e : graph.get(curr)) {
                if (visited.contains(e.node))
                    continue;
                double res = dfs(e.node, target, visited);
                if (res != -1.0)
                    return e.value * res;
            }
            return -1.0;
    }

    static class Edge {
        String node;
        double value;

        Edge(String node, double value) {
            this.node = node;
            this.value = value;
        }
    }
}

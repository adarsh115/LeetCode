class Solution {
    List<List<Integer>> ans;

    public void dfs(int[][] graph, int u, int n, List<Integer> list) {
        if (u == n - 1) {
            ans.add(new ArrayList<Integer>(list));
            return;
        }

        for (int v : graph[u]) {
            list.add(v);
            dfs(graph, v, n, list);
            list.remove(list.size() - 1);
        }
    }

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        this.ans = new ArrayList<>();
        int n = graph.length;
        List<Integer> list = new ArrayList<>();

        list.add(0);
        dfs(graph, 0, n, list);
        return ans;
    }
}

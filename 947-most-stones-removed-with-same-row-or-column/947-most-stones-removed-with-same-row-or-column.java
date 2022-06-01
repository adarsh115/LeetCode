class DSU {
    int[] parent;
    int[] rank;

    public DSU(int size) {
        parent = new int[size];
        rank = new int[size];
        for (int i = 0; i < size; i++) {
            parent[i] = i;
            rank[i] = 1;
        }
        
        
    }

    public int find(int x) {
        if (parent[x] != x) parent[x] = find(parent[x]);
        return parent[x];
    }

    public void union(int x, int y) {
        int xr = find(x), yr = find(y);
        
        if (rank[xr] < rank[yr]) {
            parent[xr] = yr;
        } else if (rank[xr] > rank[yr]) {
            parent[yr] = xr;
        } else {
            parent[yr] = xr;
            rank[xr]++;
        }
        
    }
}
class Solution {
    public int removeStones(int[][] stones) {
        DSU u = new DSU(20005);
        for(int stone[] : stones){
            u.union(stone[0], stone[1] + 10001);
        }
        
        Set<Integer> set = new HashSet<>();
        
        for(int stone[] : stones){
            set.add(u.find(stone[0]));
        }
        
        int comp = set.size();
        
        return stones.length - comp;
        
        
        
        
        
        
    }
}
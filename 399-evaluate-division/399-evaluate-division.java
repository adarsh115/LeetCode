class Solution {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        int len = 0;
        // variable:index
        Map<String, Integer> indexMap = new HashMap<>();
        for(List<String> e : equations) {
            if(!indexMap.containsKey(e.get(0))){
                indexMap.put(e.get(0), len);
                len++;
            }
            if(!indexMap.containsKey(e.get(1))){
                indexMap.put(e.get(1), len);
                len++;
            }
        }
        // disjoint set
        int[] parent = new int[len];
        int[] rank = new int[len];
        // quotient: quotient[i] means quotient of (variable_i)/(i's parent)
        double[] quotient = new double[len];
        for(int i=0;i<len;i++){
            parent[i] = i;
            quotient[i] = 1;
        }
        for(int i = 0; i<values.length; i++){
            List<String> e = equations.get(i);
            double v = values[i];
            // union starts
            // parent index, quotient
            Pair<Integer, Double> parentQuotient0 = find(parent, indexMap.get(e.get(0)), quotient);
            Pair<Integer, Double> parentQuotient1 = find(parent, indexMap.get(e.get(1)), quotient);
            int p0 = parentQuotient0.getKey();
            double v0 = parentQuotient0.getValue();
            int p1 = parentQuotient1.getKey();
            double v1 = parentQuotient1.getValue();
            // already exist in the same tree
            if(p0 == p1) continue;
            // build tree by rank, reducing the height of the tree
            if(rank[p0] > rank[p1]){
                parent[p1] = p0;
                quotient[p1] = v0/v1 * v;
            }else if(rank[p1] > rank[p0]){
                parent[p0] = p1;
                quotient[p0] = v1/v0 / v;
            }else{
                parent[p1] = p0;
                quotient[p1] = v0/v1 * v;
                rank[p0]++;
            }
        }
        double[] ans = new double[queries.size()];
        for(int i=0;i<queries.size();i++) {
            List<String> q = queries.get(i);
            Integer dividendIndex = indexMap.get(q.get(0));
            Integer divisorIndex = indexMap.get(q.get(1));
            if(dividendIndex == null || divisorIndex == null) {
                // not exists before
                ans[i] = -1;
                continue;
            }
            Pair<Integer, Double> parentQuotient0 = find(parent, dividendIndex, quotient);
            Pair<Integer, Double> parentQuotient1 = find(parent, divisorIndex, quotient);
            int p0 = parentQuotient0.getKey();
            int p1 = parentQuotient1.getKey();
            if(p0 != p1) {
                // not exists in the same tree
                ans[i] = -1;
                continue;
            }
            ans[i] = parentQuotient1.getValue() / parentQuotient0.getValue();
        }
        return ans;
    }
    
    // find with path compression
    // return: parent index, quotient
    private Pair<Integer, Double> find(int[] parent, int x, double[] quotient){
        if(parent[x] == x) return new Pair(parent[x], quotient[x]);
        Pair<Integer, Double> parentQuotient = find(parent, parent[x], quotient);
        parent[x] = parentQuotient.getKey();
        quotient[x] *= parentQuotient.getValue();
        return new Pair(parent[x], quotient[x]);
    }
}

class UnionFind{
    public int root[];
    public int rank[];
    
    public UnionFind(int x){
        root = new int[x];
        rank = new int[x];
        
        for(int i = 0;i<x; i++){
            root[i] = i;
            rank[i] = i;
        }
    }
    
    public int find(int x){
        if(x == root[x])return x;
        return root[x] = find(root[x]);
    }
    
    public void union(int x, int y){
        int rootX = find(x);
        int rootY = find(y);
        
        if(rootX != rootY){
            if(rank[rootX] >= rank[rootY]){
                root[rootY] = rootX;
                rank[rootX] += rank[rootY];
            }
            else {
                root[rootX] = rootY;
                rank[rootY] += rank[rootX];
            }

        }
    }
}
class Solution {

    
    public String smallestStringWithSwaps(String s, List<List<Integer>> pairs) {
        int n = s.length();
        
        UnionFind u = new UnionFind(n);
        
        for(List<Integer> l : pairs){
            int x = l.get(0);
            int y = l.get(1);
            
            u.union(x,y);
        }
        
        Map<Integer, PriorityQueue<Character>> map = new HashMap<>();
        for(int i=0; i<n; i++){
            int root = u.find(i);
         
            map.putIfAbsent(root, new PriorityQueue<Character>());
            map.get(root).add(s.charAt(i));
        }
        
        String ans = "";
        
        for(int i = 0; i<n; i++){
            int root = u.find(i);
            
            PriorityQueue<Character> p = map.get(root);
          
            String c = p.remove()+"";
            ans += c;
            
        }
        
        return ans;
    }
}
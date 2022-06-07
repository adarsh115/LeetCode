class Solution {
    
    public List<Integer> solve(int N, List<List<Integer>> ans){
        if(N == 1){
            List<Integer> base = new ArrayList<>();
            base.add(1);
            
            ans.add(base);
            return base;
        }
        
        
        List<Integer> previous = solve(N-1,ans);
        List<Integer> current = new ArrayList<>(N);
        
        current.add(0, previous.get(0));
        for(int i = 1; i<N-1;i++){
            int curr = previous.get(i) + previous.get(i-1);
            current.add(i, curr);
        }
        current.add(N-1, previous.get(previous.size() -1));
    
        ans.add(current);
        
        return current;
    }
      
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        solve(numRows, ans);
        
        return ans;
    }
}
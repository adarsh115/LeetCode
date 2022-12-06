class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        
        solve(ans, new ArrayList<>(), 1, n, k);
        
        return ans;
    }
    
    public void solve(List<List<Integer>> ans, ArrayList<Integer> list, int start, int n, int k){
        if(list.size() == k){
            ans.add(new ArrayList<>(list));
            return;
        }
        
        for(int i=start; i<=n; i++){
            list.add(i);
            solve(ans, list, i+1, n, k);
            list.remove(list.size()-1);
        }
    }
}
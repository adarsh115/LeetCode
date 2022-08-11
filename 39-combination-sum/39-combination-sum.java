class Solution {
    
    List<List<Integer>> combinations = new ArrayList<>();
    int n;
    
    public void solve(int candidates[], int i, int target, List<Integer> list){
        if(i == n  || target <= 0){
            if(target == 0){
                combinations.add(new ArrayList<>(list));
                return;
            }
            
            return;
        }
        
        if(target >= candidates[i]){
            list.add(candidates[i]);
            solve(candidates, i, target-candidates[i], list);
            list.remove(list.size()-1);
        }
        
        
        solve(candidates, i+1, target, list);    
        
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        this.n = candidates.length;
        
        solve(candidates, 0, target, new ArrayList<>());
        
        return combinations;
    }
}
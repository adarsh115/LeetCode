class Solution {
    List<List<Integer>> ans;
    Set<Integer> set = new HashSet<>();
    
    public void solve(int candidates[], int i, ArrayList<Integer> list, int target){
        if(i == candidates.length || target <= 0){
            
            if(target == 0){
                int hashCode = list.hashCode();
                
                if(!set.contains(hashCode)){
                    ans.add(new ArrayList<>(list));
                    set.add(hashCode);
                }
            }
            
            return;
        }
        
        list.add(candidates[i]);
        solve(candidates, i+1, list, target-candidates[i]);
        list.remove(list.size()-1);
        
        while(i+1 < candidates.length && candidates[i] == candidates[i+1]) i += 1;
        solve(candidates, i+1, list, target);
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        this.ans = new ArrayList<>();
        solve(candidates, 0, new ArrayList<>(), target);
        
        return ans;
    }
}
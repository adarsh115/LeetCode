class Solution {
    
    List<List<Integer>> combination = new ArrayList<>();
    int size;
    
    HashSet<Integer> codes = new HashSet<>();
    
    public void solve(int[] candidates, int i, int target, List<Integer> list){
        if(i == size || target <= 0){
            
            if(target == 0){
                int code = list.hashCode();
                
                if(!codes.contains(code)){
                    combination.add(new ArrayList<>(list));
                    codes.add(code);
                }
                return;
            }
            return;
        }
        
        list.add(candidates[i]);
        solve(candidates, i+1, target-candidates[i], list);
        list.remove(list.size()-1);
        
        while(i+1 < size && candidates[i] == candidates[i+1]) i += 1;
        solve(candidates, i+1, target, list);
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        this.size = candidates.length;
        
        Arrays.sort(candidates);
        solve(candidates, 0, target, new ArrayList<>());
        
        return combination;
    }
}
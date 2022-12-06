class Solution {
    List<List<Integer>> combo;
    int n;
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        this.combo = new ArrayList<>();
        this.n = candidates.length;
        ArrayList<Integer> list = new ArrayList<>();
        
        solve(candidates, list, 0, target);
        
        return combo;
    }
    
    
    public void solve(int arr[], ArrayList<Integer> list, int i, int target){
        if(i == n || target == 0){
            if(target == 0){
                combo.add(new ArrayList(list));
            }
            
            return;
        }
        
        if(arr[i] <= target){
            list.add(arr[i]);
            solve(arr, list, i, target-arr[i]);
            list.remove(list.size()-1);
        }
        
        solve(arr, list, i+1, target);
        
    }
}
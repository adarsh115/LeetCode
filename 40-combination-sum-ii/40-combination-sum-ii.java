class Solution {
    public boolean solve(int arr[], int index, int target, List<List<Integer>> ans, List<Integer> list){
        if(target == 0){
            ans.add(new ArrayList(list));
            return true;
        }
        if(target < 0)return true;
        
        for(int i = index; i < arr.length; i++){
            if(i > index && arr[i] == arr[i-1])continue;
            
            
            
            list.add(arr[i]);
            boolean current = solve(arr, i + 1, target - arr[i], ans, list);
            list.remove(list.size() - 1);
            
            if(current)break;
        }
        
        return false;
    }
    
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        solve(candidates, 0, target, ans, new ArrayList<>());
        
        return ans;
    }
}
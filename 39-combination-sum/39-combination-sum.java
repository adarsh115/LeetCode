class Solution {
    List<List<Integer>> combination = new ArrayList<>();
    int arr[];
    
    public void solve(int index, int N, int target, ArrayList<Integer> list){
        if(index == N){
            if(target == 0){
                combination.add(new ArrayList(list));
            }
            return;
        }
        
        if(target > 0){
            list.add(arr[index]);
            solve(index, N, target-arr[index], list);
            list.remove(list.size()-1);
        }
        
        solve(index+1, N, target, list);
        
    }
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        this.arr = candidates;
        int n = candidates.length;
        solve(0, n, target, new ArrayList<>());
        
        return combination;
    }
}
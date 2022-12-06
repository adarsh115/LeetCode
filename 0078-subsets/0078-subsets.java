class Solution {
    List<List<Integer>> powerSet;
    public List<List<Integer>> subsets(int[] nums) {
        this.powerSet = new ArrayList<>();
        int n = nums.length;
        
        ArrayList<Integer> list = new ArrayList<>();
        solve(nums, list, n, 0);
        
        return powerSet;
    }
    
    
    public void solve(int nums[], ArrayList<Integer> list, int n, int i){
        if(i == n){
            powerSet.add(new ArrayList(list));
            return;
        }
        
        solve(nums, list, n, i+1);
        list.add(nums[i]);
        solve(nums, list, n, i+1);
        list.remove(list.size()-1);
        
        
    }
}
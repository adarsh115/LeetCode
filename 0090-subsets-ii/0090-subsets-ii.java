class Solution {
    List<List<Integer>> ans;
    Set<Integer> set = new HashSet<>();
    
    public void solve(int nums[], int i, ArrayList<Integer> list){
        if(i >= nums.length){
            int hashCode = list.hashCode();
            if(!set.contains(hashCode)){
                ans.add(new ArrayList<>(list));
                set.add(hashCode);
            }
            
            return;
        }
        
        list.add(nums[i]);
        solve(nums, i+1, list);
        list.remove(list.size()-1);
        
        solve(nums, i+1, list);
        
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        this.ans = new ArrayList<>();
        Arrays.sort(nums);
        
        solve(nums, 0, new ArrayList<>());
        
        return ans;
    }
}
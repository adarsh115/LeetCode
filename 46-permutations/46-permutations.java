class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    
    public void solve(int nums[], boolean visited[], List<Integer> list){
        if(list.size() == nums.length){
            ans.add(new ArrayList(list));
            return;
        }
        
        for(int i=0 ; i<nums.length; i++){
            if(!visited[i]){
                visited[i] = true;
                
                list.add(nums[i]);
                solve(nums, visited, list);
                list.remove(list.size() - 1);
                
                visited[i] = false;
            }
        }
    }
    
    public List<List<Integer>> permute(int[] nums) {
        boolean visited[] = new boolean[nums.length + 1];
        List<Integer> list = new ArrayList<>();
        
        solve(nums, visited, list);
        return ans;
    }
}
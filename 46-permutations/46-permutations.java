class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    HashMap<Integer, Boolean> map = new HashMap<>();
    
    
    public void solve(int nums[], List<Integer> list){
        if(list.size() == nums.length){
            ans.add(new ArrayList(list));
            return;
        }
        
        for(int i=0 ; i<nums.length; i++){
            if(!map.get(nums[i])){
                map.replace(nums[i], true);
                
                list.add(nums[i]);
                solve(nums,  list);
                list.remove(list.size() - 1);
                
                map.replace(nums[i], false);
            }
        }
    }
    
    public List<List<Integer>> permute(int[] nums) {
        boolean visited[] = new boolean[nums.length + 1];
        List<Integer> list = new ArrayList<>();
        for(int x : nums){
            map.put(x, false);
        }
        solve(nums, list);
        return ans;
    }
}
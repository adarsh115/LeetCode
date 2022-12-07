class Solution {
    public List<List<Integer>> permute(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Boolean> map = new HashMap<>();
        for(int num: nums){
            map.put(num, false);
        }
        
        
        List<List<Integer>> perm = new ArrayList<>();
        solve(nums, perm, new ArrayList<Integer>(), map);
        
        return perm;
    }
    
    public void solve(int nums[], List<List<Integer>> perm, List<Integer> list, HashMap<Integer, Boolean> map){
        if(list.size() == nums.length){
            perm.add(new ArrayList<>(list));
            return;
        }
        Set<Integer> set = new HashSet<>();
        
        for(int i=0; i<nums.length; i++){
            if(set.contains(nums[i]))continue;
            set.add(nums[i]);
            if(!map.get(nums[i])){
                map.put(nums[i], true);
                list.add(nums[i]);
                solve(nums, perm, list, map);
                list.remove(list.size()-1);
                map.put(nums[i], false);
            }
        }
    }
}
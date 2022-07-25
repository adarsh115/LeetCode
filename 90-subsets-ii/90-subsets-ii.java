class Solution {
    HashSet<Integer> codes = new HashSet<>();
    List<List<Integer>> subsets = new ArrayList<>();
    
    public void solve(int nums[], int i, int N, List<Integer> list){
        if(i == N){
            int hashcode = list.hashCode();
            
            if(!codes.contains(hashcode)){
                subsets.add(new ArrayList(list));
                codes.add(hashcode);
                return;
            }
            
            return;
        }
        
        list.add(nums[i]);
        solve(nums, i+1, N, list);
        
        list.remove(list.size()-1);
        solve(nums, i+1, N, list);    
  
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        solve(nums, 0, n, new ArrayList<>());
        return subsets;
    }
}
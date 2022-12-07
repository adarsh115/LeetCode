class Solution {
    HashMap<Integer, Boolean> map = new HashMap<>();
    
    
    public List<List<Integer>> permuteUnique(int[] nums) {
                List<List<Integer>> res=new ArrayList<>();
        boolean[] visited=new boolean[nums.length];
        Arrays.sort(nums);
        findans(nums,res,visited,new ArrayList());
        return res;
    }
    public void findans(int[] nums,List<List<Integer>> res,boolean[] visited,List<Integer> curr)
    {
        if(curr.size()==nums.length)
        {
            res.add(new ArrayList(curr));//one answer found so add in result
            return;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(visited[i]==true) 
            {
                //if element is already visited continue
                continue;
            }
            if(i>0 && nums[i]==nums[i-1] && !visited[i-1])
            {
                continue;
            }
            curr.add(nums[i]);//add the present number
            visited[i]=true;// mark the element is true
            findans(nums,res,visited,curr);//find next number
            //backtrack
            curr.remove(curr.size()-1);//remove last element from curr list
            visited[i]=false;//makae present element false
        }
    }
    
//     public void solve(int nums[], int st, ArrayList<Integer> list, List<List<Integer>> perm){
//         if(list.size() == nums.length){
//             perm.add(new ArrayList<>(list));
//             return;
//         }
        
//         Set<Integer> set = new HashSet<>();
//         for(int i=st; i<nums.length; i++){
//             if(set.contains(nums[i]))continue;
            
//             set.add(nums[i]);
//             if(map.get(nums[i]) == false){
//                 map.put(nums[i], true);
                
//                 list.add(nums[i]);
//                 solve(nums, st+1, list, perm);
//                 list.remove(list.size()-1);
                
//                 map.put(nums[i], false);
//             }

//         }
//     }
}
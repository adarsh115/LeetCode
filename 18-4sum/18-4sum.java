class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ls = new ArrayList();
        HashSet<List<Integer>> set = new HashSet();
        
        if(nums.length < 3)return ls;
        int n = nums.length;
        Arrays.sort(nums);
        
        for(int i = 0; i< n-3; i++){
            for(int j = i+1; j<n-2; j++){
                
                int two_sum = target - (nums[i] + nums[j]);
                int start = j+1;
                int end = n-1;
                while(start < end){
                    int sum = nums[start] + nums[end];
                    if(sum == two_sum){
                        List <Integer> list = new ArrayList();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[start]);
                        list.add(nums[end]);
                        // System.out.print(list);
                        ls.add(list);
                        
                        while(start < end && nums[start] == nums[start+1])start++;
                        start++;
/*                      eg
//                      : 0 ,0 ,0, 1
//                      while(nums[start] = nums[start+1])start++, i.e, while(nums[start] == 0)start++;
                        loop will stop at lst zero, but we need to skip this last zero as well, hence 
                        start++;
                        same goes for end;
                        and we are doing same thing for i and j; we are skipping duplicates in while loops

*/
                        while(start < end && nums[end] == nums[end-1])end--;
                        end--;
                       
                    }
                    else if(sum > (two_sum)){
                        end--;
                    }
                    else start++;
                }
                while(j+1 < n && nums[j] == nums[j+1])j++;
            }
            while(i+1 < n && nums[i] == nums[i+1])i++;
        }

        return ls;
    }
}
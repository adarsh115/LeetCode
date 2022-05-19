class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0)return 0;
        if(nums.length == 1)return 1;
       
        HashSet<Integer> set = new HashSet<>();
        
        PriorityQueue<Integer> q = new PriorityQueue<Integer>();
        
        for(int num : nums){
            if(!set.contains(num)){
                q.add(num);
                set.add(num);
            }
           
        }
        // System.out.print(q);
        int max = 0;
        int current = 0;
        
        int top = q.remove();
        current++;
        max = Math.max(current, max);
        
        while(!q.isEmpty()){
            if(q.peek() == top + 1 ){
                current++;
                max = Math.max(current, max);
            }
            else{
                current = 1;
            }
            top = q.remove();
        }
        
        return max;
    }
}
class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        PriorityQueue<Integer> q = new PriorityQueue<>();
        
        for(int x : nums){
            q.add(x);
            
            if(q.size() > k)q.remove();
        }
        
        return q.peek();
    }
}
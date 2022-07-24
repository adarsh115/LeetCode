class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        Queue<Integer> q = new PriorityQueue<>((a,b) -> {return a - b;});
        
        
        for(int x : nums){
            q.add(x);
            
            if(q.size() > k)q.remove();
        }
        
        return q.peek();
    }
}
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        if(n <= k){
            int m = Integer.MIN_VALUE;
            for(int x : nums)m = Math.max(m, x);
            
            return new int[]{m};
        }
        
        
        int maxie[] = new int[n-k+1];
        Deque<Integer> list = new ArrayDeque<Integer>();
        // Deque<Integer> win = new ArrayDeque<>();
        // Queue<Integer> list = new PriorityQueue<Integer>((a,b) -> {return b - a;});
        
        int i = 0;
        int j = 0;

        while(j<n){
            if(list.size() == 0)list.offer(nums[j]);
            else{
                while(list.size() > 0 && list.peekLast() < nums[j])list.pollLast();
                list.offerLast(nums[j]);
            }
            
            if(j-i+1 == k){
                maxie[i] = list.peekFirst();
                if(nums[i] == list.peekFirst()){
                    list.pollFirst();
                }
                i++;
                j++;
            }
            else if(j-i+1 < k){
                j++;
            }

        }
        
        return maxie;
    }
}
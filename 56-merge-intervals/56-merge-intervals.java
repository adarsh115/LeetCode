class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        
        if(n == 1)return intervals;
        
        Arrays.sort(intervals, (a,b) -> {return a[0]-b[0];});
        
        Stack<int[]> stack = new Stack<>();
        stack.push(intervals[0]);
        
        for(int i=1; i<n; i++){
            int[]top = stack.peek();
            int start = top[0];
            int end = top[1];
            
            //Overlapping intervals
            
            if(end < intervals[i][0]){
                stack.push(intervals[i]);
            }
            else{
                stack.pop();
                int merged[] = new int[2];
                merged[0] = start;
                merged[1] = Math.max(end, intervals[i][1]);
                
                stack.push(merged);
            }
        }
        
        return stack.toArray(new int[stack.size()][2]);
    }
}
class Solution {
    int nsr[], nsl[], n;

    public void findNSR(int heights[]) {
        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            if (st.isEmpty()) nsr[i] = n; 
            else if (st.size() > 0 && heights[st.peek()] < heights[i]) nsr[i] = st.peek(); 
            else {
                while (st.size() > 0 && heights[st.peek()] >= heights[i]) st.pop();

                if (st.isEmpty()) nsr[i] = n; else nsr[i] = st.peek();
            }

            st.push(i);
        }

        Collections.reverse(Arrays.asList(nsr));
    }

    public void findNSL(int heights[]) {
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n ; i++) {
            if (st.isEmpty()) nsl[i] = -1; 
            else if (st.size() > 0 && heights[st.peek()] < heights[i]) nsl[i] = st.peek(); 
            else {
                while (st.size() > 0 && heights[st.peek()] >= heights[i]) st.pop();

                if (st.isEmpty()) nsl[i] = -1; else nsl[i] = st.peek();
            }

            st.push(i);
        }

        // Collections.reverse(Arrays.asList(nsl));
    }

    public int largestRectangleArea(int[] heights) {
        this.n = heights.length;
        this.nsr = new int[n];
        this.nsl = new int[n];

        findNSR(heights);
        findNSL(heights);
        
        System.out.println(Arrays.toString(nsr));
        System.out.print(Arrays.toString(nsl));

        int max = 0;
        for(int i =0 ; i<n; i++){
            int spreadWidth = nsr[i] - nsl[i]-1;
            
            max = Math.max(max, spreadWidth*heights[i]);
        }
        return max;
    }
}

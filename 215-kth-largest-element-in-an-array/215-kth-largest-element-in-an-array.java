class Solution {
    public int findKthLargest(int[] arr, int k) {
         Queue<Integer> minHeap = new PriorityQueue<>(Collections.reverseOrder());
          
          for(int x : arr){
              minHeap.add(x);
          }
          
          for(int j=1; j<k; j++){
              minHeap.remove();
          }
          
          return minHeap.peek();
    }
}
class Solution {
    public int findKthLargest(int[] arr, int k) {
         Queue<Integer> minHeap = new PriorityQueue<>();
          
          for(int x : arr){
              minHeap.add(x);
          }
          
          for(int j=0; j<arr.length-k; j++){
              minHeap.remove();
          }
          
          return minHeap.peek();
    }
}
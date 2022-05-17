class Pair{
    int val;
    int freq;
    Pair(int v, int f){
        val = v;
        freq = f;
    }
}
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int n : nums){
            if(map.containsKey(n))map.put(n, map.get(n)+1);
            else map.put(n, 1);
        }
        
        PriorityQueue<Pair> q = new PriorityQueue<>((a,b) -> {return a.freq - b.freq;});
        
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            int value = entry.getKey();
            int frequency = entry.getValue();
            
            // System.out.println(value + " " + frequency);
            Pair p = new Pair(value, frequency);
            q.add(p);
            
            if(q.size() > k)q.remove();
        }
        
        int ans[] = new int[q.size()];
        int i = 0;
        while(!q.isEmpty()){
            ans[i++] = q.remove().val;
        }
        // int ans[] = new int[q.size()];
        // for(int i = 0; i<q.size(); i++){
        //    ans[i] = q.peek().val;
        //     q.remove();
        // }
        
        return ans;
    }
}
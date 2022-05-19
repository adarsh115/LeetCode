class Pair{
    int val;
    int fre;
    
    Pair(int v, int f){
        val = v;
        fre = f;
    }
}
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1 );
        }
        
        Queue<Pair> q = new PriorityQueue<>((a,b) -> {return a.fre - b.fre;});
        
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            int value = entry.getKey();
            int frequency = entry.getValue();
            
            q.add(new Pair(value, frequency));
            
            if(q.size() > k)q.poll();
        }
        
        int ans[] = new int[q.size()];
        int i = 0;
        while(!q.isEmpty()){
            ans[i++] = q.poll().val;
        }
        
        return ans;
    }
}
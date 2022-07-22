class pair{
    int freq;
    int num;
    pair(int n, int f){
        this.freq = f;
        this.num = n;
    }
}
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) +1);
        }
        
        Queue<pair> q = new PriorityQueue<>((a,b) -> {return a.freq - b.freq;});
        
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            
            q.add(new pair(entry.getKey(), entry.getValue()));
            
            if(q.size() > k)q.remove();
        }
        
        System.out.print(map.values());
        int ans[] =  new int[q.size()];
        int i = q.size()-1;
        while(!q.isEmpty()){
            ans[i--] = q.remove().num;
        }
        
        return ans;
    }
}
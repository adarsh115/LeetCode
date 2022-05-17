class Solution {
    class Pair{
        int val;
        int diff;
        Pair(int v, int d){
            val = v;
            diff = d;
        }
    }
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        Queue<Pair> q = new PriorityQueue<Pair>((a,b) -> {
            if(a.diff == b.diff)return b.val - a.val;
            return b.diff - a.diff;
        });
            
            
        for(int num: arr){
            q.add(new Pair(num, Math.abs(num - x)));
            if(q.size() > k)q.remove();
        }
        
        List<Integer> list = new ArrayList<>();
        while(!q.isEmpty())list.add(q.remove().val);
        
        Collections.sort(list);
        return list;
    }
}
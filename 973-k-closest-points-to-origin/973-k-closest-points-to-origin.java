class Pair{
    int point[];
    int dist;
    
    Pair(int p[], int _d){
        dist = _d;
        point = p;
    }
}
class Solution {
    public int[][] kClosest(int[][] points, int k) {
        Queue<Pair> q = new PriorityQueue<>((a,b) -> {return b.dist - a.dist;});
        
        for(int point[]: points){
            int x = point[0]; int y = point[1];
            int distance = x*x + y*y;
            
            q.add(new Pair(point, distance));
            
            if(q.size() > k){
                q.remove();
            }
        }
        
        int ans[][] = new int[q.size()][2];

        int i = 0;
        while(!q.isEmpty()){
            ans[i++] = q.remove().point;
        }
        return ans;
    }
}
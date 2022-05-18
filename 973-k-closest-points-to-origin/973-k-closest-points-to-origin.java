class Pair{
    int key;
    int point[] = new int[2];
    Pair(int d, int p[]){
        key = d;
        point = p;
    }
}

class Solution {
    public int[][] kClosest(int[][] points, int k) {
        Queue<Pair> q = new PriorityQueue<>((a,b) -> {return b.key-a.key;});
        
        for(int arr[] : points){
            int x = arr[0];
            int y = arr[1];
            
            int distance_from_origin = x*x + y*y;
            
            q.add(new Pair(distance_from_origin, arr));
            
            if(q.size() > k)q.remove();
        }
        
        int ans[][] = new int[q.size()][2];
        
        int i = 0;
        while(!q.isEmpty()){
            ans[i++] = q.remove().point;
        }
        
        return ans;
    }
}
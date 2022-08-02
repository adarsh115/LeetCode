class Solution {
    
    public void solve(List<List<Integer>> rooms, boolean visited[], int key){
        
        visited[key] = true;
        
        for(int k : rooms.get(key)){
            if(!visited[k]){
                solve(rooms, visited, k);
            }
        }
    }
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int totalrooms = rooms.size();
        
        boolean visited[] = new boolean[totalrooms];
        
        // visited[0] = true;
        
        solve(rooms, visited, 0);
        
        for(boolean v: visited){
            if(v == false)return false;
        }
        
        return true;
    }
}
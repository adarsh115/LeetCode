class Solution {
    // boolean visited[];
    
//     public void solve(List<List<Integer>> rooms, HashSet<Integer> keys, int room){
//         visited[room] = true;
        
//         for(int key : rooms.get(room)){
//             solve(rooms, keys, key);
//         }
//         return;
//     }
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean visited[] = new boolean[rooms.size()];
        
        // solve(rooms, keys, 0);
        Stack<Integer> stack = new Stack<>();
        stack.add(0);
        
        while(!stack.isEmpty()){
            int key = stack.pop();
            visited[key] = true;
            
            for(int key_in_room : rooms.get(key)){
                if(!visited[key_in_room])stack.push(key_in_room);
            }
        }
        
        for(boolean x : visited){
            if(x == false)return false;
        }
        return true;
    }
}
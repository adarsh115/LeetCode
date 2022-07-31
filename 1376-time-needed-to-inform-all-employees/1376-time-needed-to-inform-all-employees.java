class Solution {
    HashMap<Integer, ArrayList<Integer>>map = new HashMap<>();
    int time = 0;
    int maxtime = 0;
    
    public void dfs(int headID,  int informTime[]){
        maxtime = Math.max(time, maxtime);
        if(!map.containsKey(headID))return;
        
        
        for(int employee : map.get(headID)){
             time += informTime[headID];
            
            dfs(employee, informTime);
            
            time -= informTime[headID];
        }
    }
    
    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {

        for(int i =0; i<n; i++){
            if(manager[i] != -1){
                // System.out.print(manager[i]);
                if(!map.containsKey(manager[i])){
                    map.put(manager[i], new ArrayList<>());
                            // System.out.print(map);

                    map.get(manager[i]).add(i);
                            // System.out.print(map);

                }
                else{
                    map.get(manager[i]).add(i);
                }
            }
        }
        // System.out.print(map);
        dfs(headID,  informTime);
        
        return maxtime;
    }
}
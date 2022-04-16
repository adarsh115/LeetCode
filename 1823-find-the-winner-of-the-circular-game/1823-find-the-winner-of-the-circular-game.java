class Solution {
    public int solve(ArrayList<Integer> list, int i, int k){
        if(list.size() == 1){
            return list.get(0);
        }
        int index = (i+k)%list.size();
        list.remove(index);
        
        return solve(list, index, k);
    }
    public int findTheWinner(int n, int k) {
        ArrayList<Integer> friends = new ArrayList<>();
        for(int i = 1; i<=n; i++){
            friends.add(i);
        }
        int index = 0;
        k = k-1;
        return solve(friends,index, k);
    }
}
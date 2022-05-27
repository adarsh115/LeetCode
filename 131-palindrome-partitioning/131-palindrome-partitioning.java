class Solution {
    List<List<String>> res = new ArrayList<>();
    
    public void solve(String s, int index, List<String> list){
        if(index == s.length()){
            res.add(new ArrayList(list));
            return;
        }
    
        for(int i = index; i<s.length(); i++){
            if(palin(s, index, i)){
                
                list.add(s.substring(index, i+1));
                solve(s, i+1, list);
                list.remove(list.size() - 1);
            }
        }
    }
    
    public boolean palin(String s, int st, int e){
        while(st <= e){
            if(s.charAt(st) != s.charAt(e))return false;
            st++;
            e--;
        }
        return true;
    }
    public List<List<String>> partition(String s) {
        
        solve(s, 0, new ArrayList<>());
        return res;
    }
}
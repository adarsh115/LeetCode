class Solution {
    
    List<List<Integer>> combination = new ArrayList<>();
    int arr[];
    HashSet<Integer> codes = new HashSet<>();
    
    public void solve(int index, int N, int target, ArrayList<Integer> list){
     
            if(target == 0){
                int code = list.hashCode();
                if(!codes.contains(code)){combination.add(new ArrayList(list));codes.add(code);}
                return;
            }
            if(index == N)return;
        
        
        	if(arr[index] <= target) {
            // include
            list.add(arr[index]);    
            solve(index+1, N, target-arr[index], list);
            list.remove(list.size()-1);
            // Skip all duplicate entries
            while(index+1 < N && arr[index] == arr[index+1]) index += 1;
            solve(index+1, N, target, list);
        }

        
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        this.arr = candidates;
        int n = candidates.length;
        Arrays.sort(arr);
        solve(0, n, target, new ArrayList<>());
        
        return combination;
    }
}
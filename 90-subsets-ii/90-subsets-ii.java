class Solution {
    Set<Integer> hash = new HashSet<>();
    List<List<Integer>> res = new ArrayList<>();
    int[] nums;
    
    public void solve(List<Integer> l, int p, int N) {
        if (p == N) {
            int h = l.hashCode();
            if (!hash.contains(h)) {
                hash.add(h);
                res.add(new ArrayList<>(l));
            }
            return;
        }
        
        l.add(nums[p]);
        solve(l, p+1, N);
        l.remove(l.size()-1);
        solve(l, p+1, N);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        
        List<Integer> subsets = new ArrayList<>();
        this.nums = nums;
        Arrays.sort(nums);
        solve(subsets,  0, nums.length);
        
        return res;
    }
    
//         Set<Integer> hash = new HashSet<>();
//     List<List<Integer>> res = new ArrayList<>();
//     int n;
//     int[] nums;
    
//     public void search(List<Integer> l, int p) {
//         if (p == n) {
//             int h = l.hashCode();
//             if (!hash.contains(h)) {
//                 hash.add(h);
//                 res.add(new ArrayList<>(l));
//             }
//             return;
//         }
//         l.add(nums[p]);
//         search(l, p+1);
//         l.remove(l.size()-1);
//         search(l, p+1);
//     }
    
//     public List<List<Integer>> subsetsWithDup(int[] nums) {
//         this.n = nums.length; this.nums = nums;
//         Arrays.sort(nums);
//         search(new ArrayList<Integer>(), 0);
//         return res;
//     }
}
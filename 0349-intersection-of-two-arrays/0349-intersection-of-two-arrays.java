class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        
        for(int i=0; i<nums1.length; i++){
            set1.add(nums1[i]);
        }
        for(int i=0; i<nums2.length; i++){
            set2.add(nums2[i]);
        }
        
        set1.retainAll(set2);
        
        Iterator<Integer> itr = set1.iterator();
        // Iterator<String> it = cars.iterator();
        int ans[] = new int[set1.size()];
        int i=0;
        while(itr.hasNext()){
            ans[i++] = itr.next();
        }
        return ans;
    }
}
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new  HashMap();
        int i = 0;
        int j = 0;
        
        int length = 0;
        int n = s.length();
        
        while(j < n){
            char x = s.charAt(j);
            if(map.containsKey(x)){
                map.put(x, map.get(x) + 1);
            }
            else{
                map.put(x,1);
            }
            
            if(map.size() == j-i+1){
                length = Math.max(length, j-i+1);
                j++;
            }
            else if(map.size() < j-i+1){
                while(map.size() < j-i+1){
                    char y = s.charAt(i);
                    map.put(y, map.get(y)-1);
                    if(map.get(y) == 0)map.remove(y);
                    i++;
                }
                
                j++;
            }
        }
        
        return length;
    }
}
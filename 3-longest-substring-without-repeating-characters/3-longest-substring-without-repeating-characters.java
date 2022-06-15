class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        Map<Character, Integer> map = new HashMap<>();
        
        int i = 0;
        int j =0;
        
        int max = 0;
        
        while(j < len){
            
            char currentChar = s.charAt(j);
            
            if(map.containsKey(currentChar)){
                map.put(currentChar, map.get(currentChar)+1);
            }
            else{
                map.put(currentChar,1);
            }
            
            if(map.size() == j - i + 1){
                max = Math.max(max, j-i+1);
                j++;
            }
            else if(map.size() < j-i+1){
                
                while(map.size() < j-i+1){
                    
                    if(map.containsKey(s.charAt(i))){
                        map.put(s.charAt(i), map.get(s.charAt(i))-1);
                    }
                    if(map.get(s.charAt(i)) == 0){
                        map.remove(s.charAt(i));
                    }
                    i++;
                }
                j++;
            }
            
        }
        
        return max;
    }
}
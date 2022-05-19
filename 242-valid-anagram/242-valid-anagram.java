class Solution {
    public boolean isAnagram(String s, String t) {
        
        Map<Character, Integer> s_map = new HashMap<>();
        Map<Character, Integer> t_map = new HashMap<>();
        
        for(char c: s.toCharArray()){
            if(s_map.containsKey(c))s_map.put(c, s_map.get(c) + 1);
            else s_map.put(c, 1);
        }
        
        for(char c: t.toCharArray()){
            if(t_map.containsKey(c))t_map.put(c,t_map.get(c) + 1);
            else t_map.put(c, 1);
        }
        
        if(s_map.size() != t_map.size())return false;
        
        for(Map.Entry<Character, Integer> entry : s_map.entrySet()){
            char currentCharacter = entry.getKey();
            int frequency_s = entry.getValue();
            
            if(t_map.get(currentCharacter) == null)return false;
            int frequency_t = t_map.get(currentCharacter);
            
            if(frequency_s != frequency_t)return false;
        }
        
        return true;
    }
}
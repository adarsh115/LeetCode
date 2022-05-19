class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();
        
        if(strs.length <= 1){
            List<String> temp = new ArrayList<>();
            temp.add(strs[0]);
            list.add(temp);
            
            return list;
        }
        
        HashMap<String, List<String> > map = new HashMap<>();
        for(String str : strs){
            char alphabet[] = new char[26];
            
            for(char c: str.toCharArray()){
                alphabet[c-'a']++;
            }
            
            String hash = new String(alphabet);
            
            if(!map.containsKey(hash))map.put(hash, new ArrayList<>());
            
                
            map.get(hash).add(str); 
        }
        list.addAll(map.values());
        return list;
    }
}
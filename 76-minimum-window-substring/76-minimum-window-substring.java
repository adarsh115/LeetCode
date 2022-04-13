class Solution {
    public String minWindow(String s, String t) {
        if(s.length() < t.length())return "";
        HashMap <Character, Integer> map = new HashMap();
        
        for(char x : t.toCharArray()){
            if(map.containsKey(x)){
                map.put(x, map.get(x)+1);
            }else{
                map.put(x, 1);
            }
        }
        int start = -1;
        int end = -1;
        int i = 0;
        int j = 0;
        int len = Integer.MAX_VALUE;
        int count = map.size();
//         while (count == 0) {
    //                 if (j - i + 1 < ansLength) {    // computing ans substring start and end index
    //                     ansI = i;
    //                     ansJ = j;
    //                     ansLength = j - i + 1;
    //                 }
    //                 char currI = s.charAt(i);
    //                 if (hm.containsKey(currI)) {    // now since we are increasing i, means character at position i will be out of SW
    //                     // hence it's frequency must be incremented
    //                     hm.put(currI, hm.get(currI) + 1);
    //                     // also if a dead character's (freq = 0) frequency becomes 1, means count has to be incremented
    //                     if (hm.get(currI) == 1) {
    //                         // count will keep count of all alive (freq greater than 0) characters
    //                         count++;
    //                         // also once the count becomes > 0, this while loop will break and we will then search in further string s
    //                         // for minimum length window having all characters of t
    //                     }
    //                 }
    //                 // increasing i, to minimize current SW from left side
    //                 i++;
    //             } 
            
//             j++; // out of all if/while blocks, j++ will be done everytime
//         }

//         if (ansLength != Integer.MAX_VALUE)
//             return s.substring(ansI, ansJ + 1);
//         else
//             return "";
        
        while(j < s.length()){
            char x = s.charAt(j);
            
            if(map.containsKey(x)){
                map.put(x, map.get(x)-1);
                if(map.get(x) == 0)count--;
            }
            while(count == 0){
                    if(j-i+1 < len){
                        start = i;
                        end = j;;
                        len = Math.min(len, j-i+1);
                    }

                    char charI = s.charAt(i);
                    if(map.containsKey(charI)){
                        map.put(charI, map.get(charI)+1);

                        if(map.get(charI) == 1)count++;
                    }
                    i++;
                }
                j++;
            }
           
        
        if(start == -1)return "";
        String ans = "";
        for(i = start; i<=end; i++){
            ans = ans + (s.charAt(i)+"");
        }
        System.out.print(len);
        return ans;
        
    }
}
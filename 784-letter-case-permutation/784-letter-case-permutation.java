class Solution {
    
    public void solve(String ip, String op, List<String> list){
        if(ip.length() == 0){
           
                list.add(op);
       
            
            return;
        }
        

        
        if(Character.isAlphabetic(ip.charAt(0))){
            String op1 = op;
            String op2 = op;
  
            op1 = op1 + ip.substring(0,1).toUpperCase();
            op2 = op2 + ip.substring(0,1).toLowerCase();
            
            ip = ip.substring(1);
            solve(ip, op1, list);
            solve(ip, op2, list);
            return;
        }
        
        String op1 = op;
        op1 = op1 + ip.substring(0,1);
        ip = ip.substring(1);
        solve(ip, op1, list);
        
        
        
        
        return;
    }
    public List<String> letterCasePermutation(String s) {
        String ip = s;
        String op = "";
        List<String> list = new ArrayList<>();
        solve(ip, op, list);
        
        return list;
    }
}
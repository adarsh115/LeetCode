class Solution {
    Set<String> set = new HashSet<>();
    public void solve(String ip, String op, List<String> list){
        if(ip.length() == 0){
            if(!set.contains(op)){
                list.add(op);
                set.add(op);
            }
            return;
        }
        

        String op1 = op;
        String op2 = op;
        
        if(Character.isAlphabetic(ip.charAt(0))){
            op1 = op1 + ip.substring(0,1).toUpperCase();
            op2 = op2 + ip.substring(0,1).toLowerCase();
        }
        else{
            op1 = op1 + ip.substring(0,1);
            op2 = op2 + ip.substring(0,1);
        }

        ip = ip.substring(1);
        
        solve(ip, op1, list);
        solve(ip, op2, list);
        
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
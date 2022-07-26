class Solution {
    public String getPermutation(int n, int k) {
        int fact = 1;
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i=1; i<n; i++){
            fact = fact*i;
            numbers.add(i);
        }
        numbers.add(n);
        
        String ans = "";
        
        k = k-1;
        
        while(true){
            int number_pos = k/fact;
            ans += numbers.get(number_pos);
            numbers.remove(number_pos);
            
            if(numbers.size() == 0)break;
            
            k = k % fact;
            fact = fact/numbers.size();
        }
        
        return ans;
    }
}
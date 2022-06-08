class Solution {
    public boolean checkPlaindrome(char arr[]){
        if(arr.length <= 1)return true;
        
        int s = 0;
        int e = arr.length - 1;
        
        while(s <= e){
            if(arr[s] != arr[e])return false;
            s++;
            e--;
        }
        
        return true;
    }
    public int removePalindromeSub(String s) {
        
        if(s.length() == 0)return 0;
        
        if(checkPlaindrome(s.toCharArray()))return 1;
        
        return 2;
    }
}
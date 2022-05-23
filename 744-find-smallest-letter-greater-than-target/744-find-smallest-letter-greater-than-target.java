class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        
        int start = 0;
        int end = letters.length-1;
        char ans = ' ';
        
        if(letters[letters.length-1] <= target)return letters[0];
        
        while(start <= end){
            int mid = start + (end - start)/2;
            
            if(letters[mid] < target){
                start = mid + 1;
            }
            else if(letters[mid] > target){
                end = mid- 1;
                ans = letters[mid%letters.length];
            }
            else{
                start = mid + 1;
            }
            
        }
        
        return ans;
    }
}
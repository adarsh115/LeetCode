class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1)return s;
        
        int row = 0, dir = 0;
        
        StringBuilder rows[] = new StringBuilder[numRows];
        for(int i=0; i<numRows; i++){
            rows[i] = new StringBuilder();
        }
        
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            
            row = row+dir;
            rows[row].append(c);
            
            if(row == 0 || row == numRows-1){
                dir = (dir == 0) ? 1 : -dir;
            }
        }
        
        
        for(int i=1; i<numRows; i++){
            rows[0].append(rows[i].toString());
        }
        
        return rows[0].toString();
    }
}
class Solution {
    public int numRescueBoats(int[] people, int limit) {
       
        int n = people.length;
        int start = 0;
        int end = n-1;
        
        Arrays.sort(people);
        int countOfBoat = 0;
        
        while(start <= end){
            if(start == end){countOfBoat++; break;}
            
            int totalWeight = people[start] + people[end];
            
            if(totalWeight <= limit){
                start++;
                end--;
                countOfBoat++; 
            }
            else if(totalWeight > limit){
                end--;
                countOfBoat++;
            }

            
        }
        return countOfBoat;
    }
}
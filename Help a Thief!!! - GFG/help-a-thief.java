// { Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            int T = Integer.parseInt(S[0]);
            int N = Integer.parseInt(S[1]);
            
            String S1[] = read.readLine().split(" ");
            String S2[] = read.readLine().split(" ");
            
            int[] A = new int[N];
            int[] B = new int[N];
            
            for(int i=0; i<N; i++)
            {
                A[i] = Integer.parseInt(S1[i]);
                B[i] = Integer.parseInt(S2[i]);
            }

            Solution ob = new Solution();
            System.out.println(ob.maxCoins(A,B,T,N));
        }
    }
}// } Driver Code Ends



class Solution {
    static class Trio{
        int value;
        int plates;
        int coins;
        
        public Trio(int v, int p, int c){
            this.value = v;
            this.plates = p;
            this.coins = c;
        }
    }
    static int maxCoins(int[] A, int[] B, int T, int N) {
        // code here
        
        if(T == 0)return 0;
        
        Trio box[] = new Trio[N];
        for(int i = 0; i<N; i++){

            int plates = A[i];
            int coins = B[i];
            
            int value = (plates * coins)/plates;
            
            box[i] = new Trio(value, plates, coins);
        }
        Arrays.sort(box, (a,b) -> {
            return b.value - a.value;
        });
        
        int sum = 0;
        
        for(Trio t : box){
            int coinperPlate = t.coins;
            int plates = t.plates;
            
            if(plates<=T){
                   sum += plates*coinperPlate;
                   T-= plates;
            }
            else{
               sum += coinperPlate*T;
               break;
            }
        }
        
        return sum;
        
    }
}
package Stones;
import java.util.*; 
public class Stones {
    public static int minStoneSum(int[] piles, int k) {

        Arrays.sort(piles);
        int length = piles.length; 

        if(length == 0) {
            return 0; 
        }

        //method: find largest, divide that by two, resort

        for(int i = 0; i < k; i++) {
            piles[length - 1] -= (int) Math.floorDiv(piles[length - 1], 2);
            if(length > 1) {
                resort(piles);
            }
        }

        int result = 0; 
        for (int i = 0; i < piles.length; i ++) {
            result += piles[i];
        }
        return result; 

    }

    //bubble up sorting
    public static void resort(int[] piles) {
        int newValue = piles[piles.length - 1];
        int i = piles.length - 2;
        
        //value is the halved value
        //piles[i] is what we are testing
        int track = 1; 
        while(i >= 0) {
            if(newValue >= piles[i]) {
                return; 
            }
            else{
                int save = piles[i];
                piles[i] = newValue;
                piles[piles.length - track] = save; 
            }
            i--;
            track++; 
        }
    }

    public static void main(String[] args) {
        int[] a = {4, 3, 6, 7};
        int k = 3; 
        System.out.println(minStoneSum(a, k));
    }
}
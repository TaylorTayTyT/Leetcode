import java.util.LinkedList;
import java.lang.Integer;
import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;

class Solution {
    public static boolean uniqueOccurrences(int[] arr) {
        ArrayList<Integer> map = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            LinkedList<Integer> temp = new LinkedList<>(); 
            if (currInd == -1) {
                map.add(0);
            } else {
                map.set(currInd, map.get(currInd) + 1);
            }
        }
        //include size here
        
        return true;

    }

    public static void main(String[] args) {
        int[] a = {1,2,2,1,1,3};
        System.out.println(uniqueOccurrences(a));
    }
}

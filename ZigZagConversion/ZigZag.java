package ZigZagConversion;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.zip.ZipInputStream;
import java.util.ArrayList;

public class ZigZag {
    public static String convertToString(ArrayList<LinkedList<Character>> depth) {
        String ans = "";
        for(int i = 0; i < depth.size(); i++) {
            int limit = depth.get(i).size(); 
            for(int j = 0; j < limit; j++) {
                ans += depth.get(i).pop();
            }
        }
        return ans; 
    }

    public static String convert(String word, int rows) {

        if (rows == 1) {
            return word; 
        }

        int zigIndex = 0;
        int cutoff = rows + 1;
        int route = 1; 

        ArrayList<LinkedList<Character>> depth = new ArrayList<>();

        for (int i = 0; i < rows; i++) {
            LinkedList<Character> temp = new LinkedList<Character>();
            depth.add(i, temp);
        }

        for (int i = 0; i < word.length(); i++) {

            if (route == -1) {
                
                depth.get(zigIndex).add(word.charAt(i)); 
                zigIndex -= 1;
            }
            
            else {
                depth.get(zigIndex).add(word.charAt(i));
                zigIndex++; 

            }
            if ((zigIndex == rows || zigIndex == -1) && i != 0) {
                
                if(route == 1) {
                    zigIndex = rows - 2; 
                }
                if(route == -1) {
                    zigIndex = 1;
                }
                route = -route;
            } 
            
        }

        
        return convertToString(depth); 
    }

    

    public static void main(String[] args) {
        System.out.println(convert("PAYPALISHIRING", 1));
    }
}
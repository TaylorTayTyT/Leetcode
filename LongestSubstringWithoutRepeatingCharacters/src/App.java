import java.util.*;

public class App {

    public static int lengthOfLongestSubstring(String s) {
        int lengthOfLongest = 0; 
        int tempLength = 0; 
        HashMap<Integer, Character> store = new HashMap<Integer, Character>();
        
        
        for (int i = 0; i < s.length(); i++) {
            Character tempChar = s.charAt(i);
            if(store.containsKey(tempChar.hashCode())) {
                tempLength = store.size(); 
                //have to start from the letter we found
                int start = s.indexOf(tempChar) + 1;
                int end = s.length() - 1; 
                s = s.substring(start, end + 1);
                if (tempLength > lengthOfLongest) {
                    lengthOfLongest = tempLength; 
                }
                store.clear();
                tempLength = 0; 
                i = -1; 
            }
            else {
                //continue on our merry way
                store.put(tempChar.hashCode(), tempChar);
                tempLength++; 
            }
        }
        if (tempLength > lengthOfLongest) {
            lengthOfLongest = tempLength; 
        }
        return lengthOfLongest; 
        
    }
    public static void main(String[] args) throws Exception {
        String a = " ";
        int length = lengthOfLongestSubstring(a);
        System.out.println("RESULT IS: " + length);
    }
}

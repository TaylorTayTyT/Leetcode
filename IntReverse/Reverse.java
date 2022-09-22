package IntReverse;

import java.util.*;

public class Reverse {
    public static int convert(String word) {
        String ans = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            if (word.charAt(i) < 48 && word.charAt(i) > 57) {
                return 0;
            }
            ans += word.charAt(i);

        }

        return Integer.parseInt(ans);
    }

    public static int reverse(int x) {
        if (x > 0 && Math.pow(2, 31) <= x) {
            return 0;
        }
        if (x < 0 && Math.pow(2, 31) < -x) {
            return 0;
        }
        try {
            int test; 
            if(x < 0) {
                test = -x;
            }
            else{
                test = x; 
            }
            convert(String.valueOf(test));
        } catch (NumberFormatException e) {
            return 0;
        }
        int ans = convert(String.valueOf(Math.abs(x)));
        if (x < 0) {
            ans = -ans;
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(reverse(-123));
    }
}

public class myAToi {
    public static int myAtoi(String s) {
        s.stripLeading(); 
        int index = 0;
        boolean pos = true; 
        String tempString = ""; 

        if (s.charAt(index) == 43 || s.charAt(index) == 45) {
            if (s.charAt(index) == 45) {
                pos = false; 
            }
            index++; 
        }

        while(index < s.length()) {
            if(s.charAt(index) < 48 || s.charAt(index) > 57) {
                break; 
            }
            tempString += s.charAt(index);
        }

        System.out.println(tempString);

        int ans = Integer.parseInt(tempString);
        
        return 1; 
    }

    public static void main(String[] args) {
        myAToi("123");
    }
}
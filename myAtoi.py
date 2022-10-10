class Solution(object):

    def myAtoi(s):
        """
        :type s: str
        :rtype: int
        """
        """implement my atoi(String s) [String to Integer]
        """
        pos = True
        onlyNumString = ""
        space = 0
        for i in range(len(s)):
            if(ord(s[i]) == 32 and space == 0):
                continue
            if (space == 0 and ((ord(s[i]) == 43) or ord(s[i]) == 45)):
                onlyNumString += s[i]
            elif(ord(s[i]) > 57 and ord(s[i]) < 48):
                break
            onlyNumString += s[i]
            space += 1
            
        int_S = int(onlyNumString)
        
        if(int_S < 0):
            int_S *= 1
            pos = False
        bitLength = int_S.bit_length()
        if (bitLength <= 32 and (not pos)) or (bitLength <= 31 and (pos)):
            return int(onlyNumString)
        
        if(pos):
            return pow(2, 32) - 1
        else:
            return pow(2,32) * -1

    print(myAtoi("12a"))
        
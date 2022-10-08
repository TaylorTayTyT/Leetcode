class Solution(object):

    def myAtoi(s):
        """
        :type s: str
        :rtype: int
        """
        """implement my atoi(String s) [String to Integer]
        """
        pos = True
        
        int_S = int(s)

        if(int_S < 0):
            int_S *= 1
            pos = False

        bitLength = int_S.bit_length()
        if (bitLength < 32 & pos) | (bitLength<= 31 & (not pos)):
            return int(s)
        
        if(pos):
            return pow(2, 32) - 1
        else:
            return pow(2,31) * -1

    print(myAtoi("ab"))
        
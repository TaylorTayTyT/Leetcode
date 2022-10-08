class Solution(object):

    def myAtoi(s):
        """
        :type s: str
        :rtype: int
        """
        """implement my atoi(String s) [String to Integer]
        """
        sum = 0
        index = len(s) - 1
        pos = 1
        for i in range(len(s)):
            if (s[i] == '-'):
                pos *= -1 
                index -= 1
                continue
            sum += (ord(s[i]) - 48) * pow(10, index)
            index -= 1
            print(sum)
        return pos * sum 
    
    print(myAtoi("-123"))
        
        
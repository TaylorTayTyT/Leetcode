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
        s = s.strip()
        for i in range(len(s)):
            if (i == 0 and (ord(s[i]) == 43 or ord(s[i]) == 45)):
                if ord(s[i]) == 45:
                    pos = False
                continue
                
            elif (ord(s[i]) <= 57 and ord(s[i]) >= 48):
                onlyNumString += s[i]
                continue
            break

        if(onlyNumString == ""):
            return 0
        if(len(onlyNumString) == 1 and (ord(onlyNumString[0]) == 43 or ord(onlyNumString[0]) == 45)):
            return 0
        int_S = int(onlyNumString)

        bitLength = int_S.bit_length()
        if (int_S >> 31 == 0 and (not pos)) or (int_S >> 31 == 0 and (pos)):
            if pos:
                return int(onlyNumString)
            return int(onlyNumString) * -1
            

        if (pos):
            return pow(2, 31) - 1 * pos
        else:
            return pow(2, 31) * -1

    print(myAtoi("2147483648"))
    print(2147483646 >> 30)

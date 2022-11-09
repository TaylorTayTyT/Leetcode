from ast import List
def longestPrefix(strs) -> str:
        prefix = ""
        try:
            for i in range(len(strs[0])):
                for j in range(len(strs)):
                    currPrefix = strs[0][i]
                    if(currPrefix != strs[j][i]):
                        if(i == 0):
                            return "There is no common prefix among the input strings."
                        return prefix
                prefix += strs[0][i]
                    
        except:
            return prefix
        return prefix

print(longestPrefix([""]))
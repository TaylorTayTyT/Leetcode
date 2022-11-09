import queue



def isMatch(s, p):
    q = queue.Queue()
    for i in range(len(s)):
        q.put(s[i])
    index = 0
    char = ''
    starPass = False
    while (not q.empty() and index < len(p)):
        char = p[index]
        if (char == '.'):
            q.get()
        elif (char == '*'):
            starPass = True
            index += 1
        elif (starPass and q.queue[0] == char):
            starPass = False
            q.get()
        elif (not starPass and not q.queue[0] == char):
            if(index + 1 < len(p) and p[index + 1] == '*'):
                index = index + 1
                continue
            return False
        else:
            q.get()
        if (not starPass):
            index += 1

    if (starPass == True):
        return True
    if (index < len(p) or not q.empty()):
        return False

    return True


#example = Solution()
#print(example.isMatch("aab", "c*a*b"))
print(isMatch("abc", "a*cc"))
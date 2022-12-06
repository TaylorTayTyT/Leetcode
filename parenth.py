
def parenth(var: str) -> int:
        stack = []
        count = 0
        try:
            for i in range(len(var)):
                char = var[i]
                if(char == '('):
                    stack.append(char)
                elif(char == ')'):
                    stack.pop()
                    count += 1
        except:
            return count
        return count

print(parenth("()())"))
    
def convet(digit: int) -> str:
    values = {
        'I': 1, 
        'IV': 4, 
        'V': 5, 
        'IX': 9,
        'X': 10, 
        'XL': 40,
        'L': 50, 
        'XC': 90,
        'C': 100, 
        'CD': 400,
        'D': 500, 
        'CM': 900,
        'M': 1000
        }
    ans = ""

    while(digit != 0):
        if(digit >= 1000):
            ans += 'M'
            digit -= 1000
        elif(digit >= 900):
            ans += 'CM'
            digit -= 900
        elif(digit >= 500):
            ans += 'D'
            digit -= 500
        elif(digit >= 400):
            ans += 'CD'
            digit -= 400
        elif(digit >= 100):
            ans += 'C'
            digit -= 100
        elif(digit >= 90):
            ans += 'XC'
            digit -= 90
        elif(digit >= 50):
            ans += 'L'
            digit -= 50
        elif(digit >= 40):
            ans += 'XL'
            digit -= 40
        elif(digit >= 10):
            ans += 'X'
            digit -= 10
        elif(digit >= 9):
            ans += 'IX'
            digit -= 9
        elif(digit >= 5):
            ans += 'V'
            digit -= 5
        elif(digit>= 4):
            ans += 'IV'
            digit -=4
        elif(digit >= 1): 
            ans += 'I'
            digit -= 1
        else:
            break
    return ans
        
print(convet(23))
        
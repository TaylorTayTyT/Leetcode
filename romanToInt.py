import queue

def compare(char1, char2):
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
    
def romToInt(rom: str) -> int:
        values = {
            '': 0,
            'I': 1, 
            'V': 5, 
            'X': 10, 
            'L': 50, 
            'C': 100, 
            'D': 500, 
            'M': 1000
        }
        roman = queue.Queue()
        for i in range(len(rom) - 1, -1, -1):
            roman.put(rom[i])
        prevChar = ''
        total = 0
        while(not roman.empty()):
            currChar = roman.get()
            prevCharValue = values[prevChar]
            currCharvalue = values[currChar]

            if (prevCharValue > currCharvalue):
                total -= currCharvalue
            else:
                total += currCharvalue

            prevChar = currChar
        return total

print(romToInt("MCMXCIV"))
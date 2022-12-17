import math
def billboard(arrDist, arrVal):
    M = [0] * (len(arrDist) + 1) 
    value = 0 
    maxDist = 0
    for i in range(1, len(arrDist) + 1):
        if(maxDist == 0 or arrDist - maxDist > 5):
            value = arrVal[i]
        M[i] = max(M[i-1], M[i - 1] + value)

        if(M[i] != M[i - 1]):
            maxDist = arrDist[i]
    return M[len(arrDist)]

arrDist = [6, 7, 12, 14]
arrVal = [5, 6, 5, 1]
print(billboard(arrDist, arrVal))
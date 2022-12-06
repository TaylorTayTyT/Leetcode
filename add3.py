#Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] 
#such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

#Notice that the solution set must not contain duplicate triplets.

def add3(nums: list):
    numsSorted = sorted(nums)
    i = 0
    j = len(numsSorted) - 1
    sum = 0
    ans = []
    while i < j:
        sum = numsSorted[i] + numsSorted[j]
        if(sum < 0):
            sum += numsSorted[j-1]
        else:
            sum += numsSorted[i+1]
        if sum == 0:
            tempList = [numsSorted[i], numsSorted[j-1], numsSorted[j]]
            ans += tempList
        else:
            j -= 1
        i += 1


    return numsSorted
print(add3([-1, -2, 9]))
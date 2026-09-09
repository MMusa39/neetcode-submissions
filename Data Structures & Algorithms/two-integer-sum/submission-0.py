class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        numsSorted = nums.copy()
        numsSorted.sort()
        print(numsSorted)
        left = 0
        right = len(nums) - 1
        while (val := numsSorted[left] + numsSorted[right]) != target:
            if val > target:
                right-=1
            else:
                left+=1
        leftIndex = nums.index(numsSorted[left])
        rightIndex = 0
        if numsSorted[left] == numsSorted[right]:
            rightIndex = nums.index(numsSorted[right], leftIndex + 1)
        else:
            rightIndex = nums.index(numsSorted[right])
        
        if leftIndex < rightIndex:
            return [leftIndex, rightIndex]
        else:
            return [rightIndex, leftIndex]
        

        
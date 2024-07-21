class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        prevMap = {} # hasmap of elems

        for i in range(len(nums)):
            reqNum = target - nums[i]
            if reqNum in prevMap.keys():
                return [i, prevMap[reqNum]]
            prevMap[nums[i]] = i
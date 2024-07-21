class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        distSet = set()

        for i in range(len(nums)):
            if nums[i] in distSet:
                return True
            distSet.add(nums[i])
        return False
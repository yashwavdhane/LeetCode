class Solution(object):
    def missingNumber(self, nums):
        a = len(nums)+1
        for y in range(a):
            if y not in nums:
                return y

        
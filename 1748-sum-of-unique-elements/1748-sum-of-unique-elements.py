class Solution(object):
    def sumOfUnique(self, nums):
        d = dict()
        for x in nums:
            d[x]=0
        for x in nums:
            d[x]+=1
        s=0
        for x in d:
            if d[x]==1:
                s+=x
        return s
        
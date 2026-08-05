class Solution(object):
    def pivotArray(self, nums, pivot):
        small =[]
        large = []
        p =[]
        for x in nums:
            if x<pivot:
                small.append(x)
            elif x==pivot:
                p.append(x)
            else:
                large.append(x)
        return small+p+large
            
        
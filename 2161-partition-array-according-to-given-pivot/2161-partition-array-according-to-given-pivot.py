class Solution(object):
    def pivotArray(self, nums, pivot):
        small =[]
        large = []
        p = 0
        for x in nums:
            if x<pivot:
                small.append(x)
            elif x==pivot:
                p+=1
            else:
                large.append(x)
        return small+p*[pivot]+large
            
        
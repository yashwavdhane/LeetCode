class Solution(object):
    def minimumPushes(self, word):
            d = {}
            for x in word:
                if x in d:
                    d[x] += 1
                else:
                    d[x] = 1
            l = [d[x] for x in d]
            l.sort(reverse=True)
            cost=0
            count=0
            for x in l:
                cost+=x*((count//8)+1)
                count+=1
            return cost
class Solution(object):
    def maxDistinct(self, s):
        """
        :type s: str
        :rtype: int
        """
        m = set()
        for x in s:
            if x not in m:
                m.add(x)
        return len(m)
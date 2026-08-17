class Solution(object):
    def rotateString(self, s, goal):
        i=""
        for x in range(len(s)):
            i += s[x]
            j = s[x+1:]+i
            if goal == j:
                return True
        return False
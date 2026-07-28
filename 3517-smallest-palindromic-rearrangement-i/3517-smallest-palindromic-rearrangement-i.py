class Solution(object):
    def smallestPalindrome(self, s):
        mid = len(s)/2
        if(len(s)%2==0):
            sorted_text = "".join(sorted(s[0:mid])) + "".join(sorted(s[0:mid], reverse=True))
            return sorted_text
        else :
            m = s[mid]
            sorted_text = "".join(sorted(s[0:mid])) + m +"".join(sorted(s[0:mid], reverse=True))
            return sorted_text
        
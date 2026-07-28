class Solution(object):
    def smallestPalindrome(self, s):
        mid=len(s)//2

        if len(s)%2==0:
            sorted_text= "".join(sorted(s[:mid])) + "".join(sorted(s[mid:], reverse=True))
        else:
            sorted_text= "".join(sorted(s[:mid])) + s[mid] + "".join(sorted(s[mid+1:], reverse=True))
        return sorted_text
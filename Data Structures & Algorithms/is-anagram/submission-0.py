class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        charCounts = [0] * 26
        for char in s:
            charCounts[ord(char) - ord('a')]+=1
        for char in t:
            index = ord(char) - ord('a')
            charCounts[index]-=1
            if charCounts[index] < 0:
                return False    
        return True
        
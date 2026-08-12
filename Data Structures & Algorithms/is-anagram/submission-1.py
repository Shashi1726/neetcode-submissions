class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        char_count = [0] * 26
        for i in s:
            char_count[ord(i) - ord('a')]+=1
        
        for i in t:
            char_count[ord(i) - ord('a')]-=1
        
        for i in range(len(char_count)):
            if char_count[i] == 0:
                continue
            else:
                return False
        return True
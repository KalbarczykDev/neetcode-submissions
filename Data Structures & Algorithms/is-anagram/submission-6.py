from collections import Counter

class Solution:
    def isAnagram(self, s: str, t: str) -> bool:

        if len(s) != len(t) :
            return False;

        contains = {}

        for c in s :
            contains[c] = contains.get(c, 0) + 1

        for c in t :
            contains[c] = contains.get(c, 0) - 1
            if contains[c] < 0 :
                return False
        
        return True
        
       

      

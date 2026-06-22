class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:

        map = []

        for n in nums :
            if n in map  :
                return True
            map.append(n)
        
        return False
        
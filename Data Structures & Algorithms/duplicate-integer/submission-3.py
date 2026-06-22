class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:

        my_map = []


        for num in nums:
            if num in my_map:
                return True
            
            my_map.append(num)

        
        return False
        
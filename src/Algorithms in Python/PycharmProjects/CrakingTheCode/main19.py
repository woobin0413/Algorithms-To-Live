# -*- coding: utf-8 -*-
def twoSum(nums, target):
    """
    :type nums: List[int]
    :type target: int
    :rtype: List[int]
    """

    dicts = {}
    for i in range(0, len(nums)):
        x = nums[i]
        if x in dicts:
            print(dicts)
            return [dicts.get(x), i]
        dicts[target - x] = i

nums = [3, 2, 4]
target = 6

print(twoSum(nums,target))

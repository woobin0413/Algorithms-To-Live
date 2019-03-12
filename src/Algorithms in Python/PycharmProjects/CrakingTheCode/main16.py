
def twoSum(nums, target):
    """
    :type nums: List[int]
    :type target: int
    :rtype: List[int]
    """

    list = []
    temp = 0
    for x in range(len(nums)):
        temp = 0
        temp = target - nums[x]

        if temp in nums and temp not in list:
            if nums.index(temp) ==
                continue
            else:
                list.append(x)
    return list

if __name__=='__main__':

    nums = [3, 3]
    target = 6
    print(twoSum(nums,target))
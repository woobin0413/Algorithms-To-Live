def dominantIndex(nums):
    max1 = 0
    max2 = 0

    for num in nums:
        if num > max1:
            max2 = max1
            max1 = num
        elif num > max2:
            max2 = num

    if max1 >= max2*2:
        return nums.index(max1)
    else:
        return -1

if __name__ == '__main__':
    nums = [1,3,2,6]
    print(dominantIndex(nums))
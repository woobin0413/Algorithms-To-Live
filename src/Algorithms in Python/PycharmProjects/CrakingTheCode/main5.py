# def twoTargetedSum(arr, sum):
#     if bool(arr):
#         result = 0
#         for i in a rr:
#             for n in arr:
#                 if(i+n == sum):
#                     s.append(i)
#                     s.append(n)
#         return s
#     else:
#         return

def twoTargetedSum(arr, sum):
    if bool(arr):
        new_arr = []
        for i in range(0, len(arr)):
            if sum-arr[i] in arr:
                new_arr.append(arr[i])
        return new_arr

if __name__ == '__main__':
    myDict = [1, 4, 6, 7, 13, 2, 5, 10, 11]

    print twoTargetedSum(myDict, 15)

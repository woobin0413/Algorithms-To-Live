#
# def countSetBit(n):
#
#     count = 0
#
#     for i in range(1, n+1):
#         for ch in bin(i):
#             if(ch == '1'):
#                 count += 1
#     return count
#
#
# if __name__ == '__main__':
#     n = 4
#     # print(bin(n))
#     print 'Total set bit count for number',n , ':',countSetBit(n)
def iterateNumber(n):
    count = 0

    for i in range(1, n+1):
        count += countSetBits(i)
    return count

def countSetBits(x):

    if(x<=0):
        return 0
    return(0 if(x % 2) == 0 else 1) + countSetBits(x/2)

if __name__ == '__main__':
    print (iterateNumber(17))
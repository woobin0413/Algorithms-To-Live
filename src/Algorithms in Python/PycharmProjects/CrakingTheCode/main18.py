# # -*- coding: utf-8 -*-
#
# def reverse(x):
#     woStr = str(abs(x))
#     originStr = str(x)
#     dash = False;
#     for i in originStr:
#         if(i == '-'):
#             dash = True
#
#     result = ''
#     if(dash == True):
#         result += '-'
#     for a in reversed(woStr):
#         result += a
#
#     return int(result)
#
# if __name__ == '__main__':
#     x = 1534236469
#     print(reverse(x))

def reverseFunc(x):
    neg = False
    if x < 0:
        neg = True
        x = x * -1
    s = str(x)[::-1]
    n = int(s)
    if neg:
        n = n*-1
    if(abs(n) > (2 ** 31 - 1)):
        return 0
    return n


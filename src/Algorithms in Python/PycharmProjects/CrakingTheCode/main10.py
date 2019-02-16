# # # -*- coding: utf-8 -*-
# # https://practice.geeksforgeeks.org/problems/segregate-0s-and-1s/0/?ref=self
#
# testCase = input()
# arrLenList = {}
# arrElement = ''
# for i in range(0, testCase):
#     arrLen = input()
#     arrLenList[i] = arrLen
#     elements = raw_input()
#     # arrElement.append(a)
#     arrElement += (elements).strip().replace(' ', '')
result = ''
for _ in range (int(input())):
    arrLen = input()
    arr = (int, input().strip().split())
    pos = -1
    for i in range(int(arrLen)):
        if arr[i] == 0:
            pos += 1
            # [1, 0, 0, 1, 0] 처음 첫번쨰에서 검사해서 0이아니면 넘어가지만
            # [0, 1, 0, 1, 0] 0 이면 포지션을 바꾼다. 1 -> 0 , 0 ->1 그래서 두가지바꿈

            arr[i], arr[pos] = arr[pos], arr[i]

    print (arr).strip().replace(',', '').replace('[','').replace(']', '')
# # -*- coding: utf-8 -*-
#https://practice.geeksforgeeks.org/problems/value-equal-to-index-value/0

testN = input()

for i in range(testN):
    arrLen = input()
    elements = raw_input()
    # space 있을때마다 단어로 쪼개준
    eachNum = elements.split()
    # 만약 숫자로 ex: 2 3 24 5 36 이렇게 했을때 24 36 이 2,4,3,6으로 되지않게
    # int(a[i]) 써준다.

    for j in range(0, len(eachNum)):
        if(j+1 == int(eachNum[j])):
            print j+1
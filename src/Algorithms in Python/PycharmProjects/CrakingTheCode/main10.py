# # -*- coding: utf-8 -*-
# https://practice.geeksforgeeks.org/problems/segregate-0s-and-1s/0/?ref=self

testCase = input()
arrLenList = {}
arrElement = ''
for i in range(0, testCase):
    arrLen = input()
    arrLenList[i] = arrLen
    elements = raw_input()
    arrElement += elements

    # arrElement.append(a)

print len(arrElement.split())
print arrElement.split()q
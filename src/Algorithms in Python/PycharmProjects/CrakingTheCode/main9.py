# # -*- coding: utf-8 -*-
# print('.', end='')
# https://practice.geeksforgeeks.org/problems/maximum-money/0

testCase = input()
for n in range(0, testCase):
    element = raw_input()
    eachStreet = element.split()
    eachHouse = int(eachStreet[0])
    eachMoney = int(eachStreet[1])
    result = 0

    if (eachHouse == 1):
        print (eachMoney)

    if (eachHouse % 2 == 0):
        result = eachHouse * eachMoney / 2
        print (int(result))

    else:
        result = (eachHouse + 1) * eachMoney / 2
        print (int(result))


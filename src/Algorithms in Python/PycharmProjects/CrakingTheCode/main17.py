# -*- coding: utf-8 -*-
from collections import defaultdict

def firstUniqChar(s):
    # stringDict = defaultdict(int)
    #
    # for letter in s:
    #     stringDict[letter] += 1
    # print(stringDict)
    # for i, letter in enumerate(s):
    #     if stringDict[letter] == 1:
    #         return i
    # return -1

    strDict = defaultdict(int)

    for letter in s:
        strDict[letter] += 1

    for i in s:
        if(strDict[i]) == 1:
            return s.index(i)

if __name__ == '__main__':
    s = "loveleetcode"
    print(firstUniqChar(s))

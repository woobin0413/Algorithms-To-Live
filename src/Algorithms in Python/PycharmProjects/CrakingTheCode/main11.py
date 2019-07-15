# -*- coding: utf-8 -*-
# https://practice.geeksforgeeks.org/problems/convert-time-from-12-hour-to-24-hour-format/0/?ref=self

for _ in range(input()):
    t = input()
# t = '07:05:45PM'

    if(t[-2:] == 'PM'):
        t = t.replace(t[-2:], '')
        if(t[:2] == '12'):
            print t
        else:
            NightTime = int(t[:2]) + 12
            print str(NightTime) + t[2:]
            # t = t.replace(t[:2], (t[:2]) + 12)
            # print t
    elif(t[-2:] == 'AM' and (t[:2]) == '12'):
        t = t.replace(t[-2:], '')
        NightTime = t.replace(t[:2], '00')
        print (NightTime)

    else:
        print t.replace(t[-2:], '')

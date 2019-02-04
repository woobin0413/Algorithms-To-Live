def charCount(n):
    # count = 0
    # for a in range(0,len(n)):
    #
    #     if(n[a] == n[a-1]):
    #         count += 1
    # print count
    #

    aCount = 0
    bCount = 0
    cCount = 0

    for i in range(len(s)):
        if(s[i] == 'a'):
            aCount = (1 + 2 * aCount)

        elif(s[i] == 'b'):
            bCount = (aCount + 2 * bCount)

        elif (s[i] == 'c'):
            cCount = (bCount + 2 * cCount)

    return cCount

if __name__ == '__main__':
    s = 'abbc'
    print charCount(s)
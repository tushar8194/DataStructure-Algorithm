def check(i):
    sq = str(i**2)
    le = len(str(i))
    r = sq[-le:]
    l = sq[:-le] or '0'
    return sum(map(int,(l,r)))==i


def kaprekarNumbers(p, q):
    rtrn = ''
    for i in range(p,q+1):
        if(check(i)):
            rtrn = rtrn + str(i) + ' '
    if(rtrn == ''):
        return 'INVALID RANGE'

    return rtrn


p = 4
q = 5
#print(kaprekarNumbers(p, q))


def surfaceArea(A):
    # Pad the grid width a layer of 0
    # for easier calculation
    a = [[0] * (len(A[0]) + 2)]
    for row in A:
        a.append([0] + row + [0])
    a.append([0] * (len(A[0]) + 2))

    # Bottom and top area
    ans = len(A) * len(A[0]) * 2

    # Side area is just the sum of differences
    # between adjacent cells. Be careful not to
    # count a side twice.
    for i in range(1, len(a)):
        for j in range(1, len(a[i])):
            ans += abs(a[i][j] - a[i - 1][j])
            ans += abs(a[i][j] - a[i][j - 1])
    return ans


print(surfaceArea(9))
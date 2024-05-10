import sys

input = sys.stdin.readline

N = int(input())

numList = list(map(int, input().split()))

numList.sort()
st = 0
et = 0
plus2 = 0
loc = 0
result = 0
if N >= 3:
    for i in range(N):
        st = 0
        et = N - 1
        loc = numList[i]
        while st < et:
            stNum = numList[st]
            etNum = numList[et]
            plus2 = stNum + etNum
            if plus2 == loc:
                if st != i and et != i:
                    result += 1
                    break
                elif st == i:
                    st += 1
                else:
                    et -= 1
            elif plus2 < loc:
                st += 1
            else:
                et -= 1
print(result)

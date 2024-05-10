import sys

input = sys.stdin.readline

N = int(input())
M = int(input())

numList = list(map(int, input().split()))

plus2 = 0
numList.sort()
stIndex = 0
etIndex = N - 1
result = 0
while stIndex < etIndex:
    plus2 = numList[stIndex] + numList[etIndex]
    if plus2 == M:
        result += 1
        stIndex += 1
        etIndex -= 1
    elif plus2 < M:
        stIndex += 1
    else:
        etIndex -= 1
print(result)
import sys

input = sys.stdin.readline

N, M = map(int, input().split())

numList = list(map(int, input().split()))

temp = 0
countMap = {}
data = 0
result = 0

for i in numList:
    temp += i
    data = temp % M
    if data == 0:
        result += 1

    if countMap.get(data) is None:
        countMap[data] = 1
    else:
        countMap[data] += 1

for j in range(M):
    if countMap.get(j) is not None and countMap[j] > 1:
        result += countMap[j] * (countMap[j] - 1) // 2
print(result)

import sys

input = sys.stdin.readline

N, M = map(int, input().split())

numList = list(map(int, input().split()))
temp = 0
a, b = 0, 0
sumMap = {0: 0}
for k in range(N):
    temp += numList[k]
    sumMap[k+1] = temp

for i in range(M):
    a, b = map(int, input().split())
    print(sumMap[b] - sumMap[a-1])
import sys
from collections import deque

input = sys.stdin.readline

n = int(input())

numList = list(map(int, input().split()))

result = deque()

ans = ['-1'] * n

for i in range(n):
    while result and numList[result[-1]] < numList[i]:
        ans[result.pop()] = str(numList[i])
    if i != n-1:
        result.append(i)

print(' '.join(ans))

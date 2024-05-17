import sys
from collections import deque

input = sys.stdin.readline

N, L = map(int, input().split())

deq = deque()

numList = list(map(int, input().split()))
for i in range(N):
    while deq and deq[-1][0] > numList[i]:
        deq.pop()
    deq.append((numList[i], i))
    if deq[0][1] <= i - L:
        deq.popleft()
    print(deq[0][0], end=' ')

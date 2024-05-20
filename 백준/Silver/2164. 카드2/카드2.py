import sys
from collections import deque

input = sys.stdin.readline

n = int(input())

numList = deque(range(1,n+1))

while True:
    if n == 1:
        print(1)
        break
    if n == 2:
        print(numList.pop())
        break
    numList.popleft()
    numList.append(numList.popleft())
    n -= 1

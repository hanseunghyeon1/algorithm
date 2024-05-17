import sys
from collections import deque

input = sys.stdin.readline

n = int(input())

numList = deque(int(input()) for i in range(n))

deq = deque()
num = 1
result = ''
for i in range(n):
    a = numList.popleft()
    if a >= num:
        while a >= num:
            deq.append(num)
            num += 1
            result += '+\n'
        deq.pop()
        result += '-\n'
    else:
        b = deq.pop()
        if b > a:
            print("NO")
            result = False
            break
        else:
            result += '-\n'
if result:
    print(result)

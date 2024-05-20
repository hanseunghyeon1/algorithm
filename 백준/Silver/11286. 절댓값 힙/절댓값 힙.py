import sys
from queue import PriorityQueue

input = sys.stdin.readline

n = int(input())

priQueue = PriorityQueue()

print = sys.stdout.write

x = 0

for i in range(n):
    x = int(input())
    if x == 0:
        if not priQueue.empty():
            print(str(priQueue.get()[1])+'\n')
        else:
            print('0\n')
    else:
        priQueue.put((abs(x), x))


import sys

sys.setrecursionlimit(10 ** 6)

input = sys.stdin.readline

n, m = map(int, input().split())

array = [[] for _ in range(n)]

visited = [False for _ in range(n)]

for _ in range(0, m):
    a, b = map(int, input().split())
    array[a].append(b)
    array[b].append(a)

check = 0

def dfs(num, cnt):
    global check
    visited[num] = True
    if cnt >= 4:
        check = 1
    else:
        for i in array[num]:
            if not visited[i]:
                dfs(i, cnt + 1)
    visited[num] = False

for i in range(0, n):
    if check:
        break
    dfs(i, 0)
if check:
    print(1)
else:
    print(0)
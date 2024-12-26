import sys
sys.setrecursionlimit(10**6)

input = sys.stdin.readline

n, m = map(int, input().split())

visited = [False for _ in range(n+1)]

checkList = [[] for _ in range(n+1)]

cnt = 0

def dfs(num):
    visited[num] = True
    for i in checkList[num]:
        if not visited[i]:
            dfs(i)

for i in range(m):
    u, v = map(int, input().split())
    checkList[u].append(v)
    checkList[v].append(u)

for i in range(1, n+1):
    if False not in visited:
        break
    if not visited[i]:
        cnt += 1
        dfs(i)

print(cnt)
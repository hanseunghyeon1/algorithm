import sys

input = sys.stdin.readline

S, P = map(int, input().split())

dnaStr = input()

A, C, G, T = map(int, input().split())

countMap = {'A':0, 'C':0, 'G':0, 'T':0}
result = 0
for i in range(S-P+1):
    if i == 0:
        for j in range(P):
            countMap[dnaStr[j]] += 1
    else:
        countMap[dnaStr[i-1]] -= 1
        countMap[dnaStr[P+i-1]] += 1
    if countMap['A'] >= A and countMap['C'] >= C and countMap['G'] >= G and countMap['T'] >= T:
        result += 1
print(result)
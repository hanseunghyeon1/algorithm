N = int(input())
startIndex = 1
endIndex = 1
sum = 1
result = 1
while endIndex != N:
    if sum == N:
        result += 1
        endIndex += 1
        sum += endIndex
    elif sum > N:
        sum -= startIndex
        startIndex += 1
    else:
        endIndex += 1
        sum += endIndex

print(result)
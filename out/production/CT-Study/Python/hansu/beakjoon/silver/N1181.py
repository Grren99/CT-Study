import sys
input = sys.stdin.readline

n = int(input())
data = list({input().strip() for _ in range(n)})

data.sort()
data.sort(key=len)

print(*data, sep='\n')

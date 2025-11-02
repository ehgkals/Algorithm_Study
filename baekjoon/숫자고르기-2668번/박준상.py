import sys

input=sys.stdin.readline

def dfs(v, i):
    n = data[v]
    visited[v]=True

    if not visited[n]:
        dfs(n, i)

    elif visited[n] and n == i:
        aws.append(n)

n = int(input())

data = [0]
for i in range(n):
    num = int(input())
    data.append(num)

aws = []

for i in range(1, n+1):
    visited=[False] * (n + 1)
    dfs(i,i)

print(len(aws))

aws.sort()
for i in aws:
    print(i)

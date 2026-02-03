import sys
from collections import deque

input = sys.stdin.readline

N, M = map(int, input().split())
tree = [[] for _ in range(N + 1)]

for _ in range(N - 1):
    s, e, d = map(int, input().split())
    tree[s].append((e, d))
    tree[e].append((s, d))

for _ in range(M):
    s, e = map(int, input().split())
    q = deque()
    visited = set()

    q.append((s, 0))
    visited.add(s)

    while q:
        v, d = q.popleft()

        if v == e:
            print(d)
            break
        
        for i, l in tree[v]:
            if i not in visited:
                visited.add(i)
                q.append((i, d + l))
import sys
from collections import deque

input = sys.stdin.readline

N, M = map(int, input().split())
hack = [[] for _ in range(N + 1)]
rank = []

for _ in range(M):
    A, B = map(int, input().split())
    hack[B].append(A)

def bfs(start):
    visited = [False] * (N + 1)
    visited[start] = True
    q = deque([start])
    cnt = 1
    while q:
        v = q.popleft()
        for nxt in hack[v]:
            if not visited[nxt]:
                visited[nxt] = True
                cnt += 1
                q.append(nxt)
    return cnt

result = [0] * (N + 1)
max_cnt = 0

for i in range(1, N + 1):
    cnt = bfs(i)
    result[i] = cnt
    if cnt > max_cnt:
        max_cnt = cnt

for i in range(1, N + 1):
    if result[i] == max_cnt:
        print(i, end=' ')

import sys
from collections import deque

input = sys.stdin.readline
queue = deque()
visited = [False] * (1_000_000 + 1)

A, K = map(int, input().split())

queue.append([K, 0])
visited[K] = True

while queue:
    k, cnt = queue.popleft()

    if k == A:
        print(cnt)
        break

    if(k % 2 == 0 and k // 2 >= A and visited[k // 2] == False):
        queue.append([k // 2, cnt + 1])
        visited[k // 2] = True
    if (k - 1 >= A and visited[k - 1] == False):
        queue.append([k - 1, cnt + 1])
        visited[k - 1] = True
import sys
from collections import deque

input = sys.stdin.readline

N, M = map(int, input().split())
campus = []
visited = set()
q = deque()
cnt = 0

for _ in range(N):
    c = list(input())
    campus.append(c)

check = False
for i in range(N):
    for j in range(M):
        if campus[i][j] == 'I':
            q.append([i, j])
            visited.add((i, j))
            check = True
            break
    if check:
        break

while q:
    x, y = q.popleft()
    dx = [1, 0, -1, 0]
    dy = [0, 1, 0, -1]

    for i in range(4):
        nx, ny = x + dx[i], y + dy[i]
        if 0 <= nx < N and 0 <= ny < M:
            if (nx, ny) not in visited and campus[nx][ny] != 'X':
                q.append([nx, ny])
                visited.add((nx, ny))
                
                if campus[nx][ny] == 'P':
                    cnt += 1

if cnt != 0:
    print(cnt)
else:
    print('TT')
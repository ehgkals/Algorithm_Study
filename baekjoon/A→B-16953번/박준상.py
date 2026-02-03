import sys
from collections import deque

input = sys.stdin.readline

A, B = map(int, input().split())
q = deque()
visited = set()

q.append([A, 1])
visited.add(A)

while q:
    a, cnt = q.popleft()
    aa = a * 2
    ab = int(str(a) + '1')

    if a == B:
        print(cnt)
        sys.exit()
            
    if aa <= B and aa not in visited:
        q.append([aa, cnt + 1])
        visited.add(aa)
    if ab <= B and ab not in visited:
        q.append([ab, cnt + 1])
        visited.add(ab)

print(-1)
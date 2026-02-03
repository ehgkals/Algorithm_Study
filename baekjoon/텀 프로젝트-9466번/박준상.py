import sys
sys.setrecursionlimit(10**7)
input = sys.stdin.readline

def dfs(x):
    global cycle_cnt
    visited[x] = True

    if not visited[select[x]]:
        dfs(select[x])

    elif not finished[select[x]]:
        cnt = 1
        cur = select[x]

        while cur != x:
            cnt += 1
            cur = select[cur]
        cycle_cnt += cnt

    finished[x] = True


T = int(input())

for _ in range(T):
    n = int(input())
    select = [0] + list(map(int, input().split()))

    visited = [False] * (n + 1)
    finished = [False] * (n + 1)
    cycle_cnt = 0

    for i in range(1, n + 1):
        if not visited[i]:
            dfs(i)

    print(n - cycle_cnt)

import sys

input = sys.stdin.readline

N, M = map(int, input().split())
video = list(map(int, input().split()))

lo, hi = max(video), sum(video)
aws = hi

while lo <= hi:
    mid = (lo + hi) // 2

    cnt = 1
    tmp = mid
    for i in video:
        if tmp < i:
            cnt += 1
            tmp = mid - i
        else:
            tmp -= i

    if cnt <= M:
        aws = mid
        hi = mid - 1
    else:
        lo = mid + 1

print(aws)
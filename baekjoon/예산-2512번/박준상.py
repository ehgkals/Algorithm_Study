import sys

input = sys.stdin.readline

N = int(input())
states = list(map(int, input().split()))
budget = int(input())

lo, hi = 0, max(states)
aws = 0

while lo <= hi:
    mid = (lo + hi) // 2
    total = sum(min(i, mid) for i in states)

    if total <= budget:
        aws = mid
        lo = mid + 1
    else:
        hi = mid - 1

print(aws)
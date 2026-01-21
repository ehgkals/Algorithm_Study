import sys
from collections import Counter
input = sys.stdin.readline

N = int(input())
w = input().strip()
cw = Counter(w)
aws = 0

for _ in range(N - 1):
    s = input().strip()
    cs = Counter(s)
    diff = sum((cw - cs).values()) + sum((cs - cw).values())

    if diff <= 2 and abs(len(w) - len(s)) <= 1:
        aws += 1

print(aws)
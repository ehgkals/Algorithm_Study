import sys

input = sys.stdin.readline

N = int(input())
rope = []
max_weight = -1

for i in range(N):
    rope.append(int(input()))

rope.sort()

for i in range(len(rope)):
    max_weight = max(max_weight, rope[i] * (N - i))

print(max_weight)
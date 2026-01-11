import sys

input = sys.stdin.readline

N = int(input())
tmp = list(map(int, input().split()))
tmp = sorted(set(tmp))

print(*tmp)
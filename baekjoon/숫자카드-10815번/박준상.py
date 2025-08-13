import sys

input = sys.stdin.readline

N = int(input())
cards = list(map(int, input().split()))
M = int(input())
tmp = list(map(int, input().split()))

dic = {}

for i in range(N):
    dic[cards[i]] = 0

for i in range(M):
    if tmp[i] in dic:
        print(1, end = ' ')
    else:
        print(0, end = ' ')
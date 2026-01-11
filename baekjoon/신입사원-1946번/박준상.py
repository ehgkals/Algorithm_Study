import sys

input = sys.stdin.readline

T = int(input())

for _ in range(T):
    N = int(input())
    score = []
    passed = 1

    for _ in range(N):
        score.append(list(map(int, input().split())))
    
    score.sort()
    min = score[0][1]

    for i in range(1, N):
        if score[i][1] < min:
            passed += 1
            min = score[i][1]
    
    print(passed)
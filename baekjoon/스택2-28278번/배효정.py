n = int(input())
stack = []

# 시간 초과 뜸 대체 왜?ㅜㅜㅜㅜㅜㅜ

for i in range(n):
    x = list(map(int, input().split()))

    if (x[0] == 1):
        stack.append(x[1])
    elif (x[0] == 2):
        if stack:
            print(stack.pop())
        else:
            print(-1)
    elif (x[0] == 3):
        print(len(stack))
    elif (x[0] == 4):
        if stack:
            print(0)
        else:
            print(1)
    else:
        if stack:
            print(stack[-1])
        else:
            print(-1)
    

        

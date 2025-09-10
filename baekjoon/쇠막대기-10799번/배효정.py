import sys

input = sys.stdin.readlines

data = list(input())

stack = []
stick = 0

for i in range(len(data)):
    if data[i] == '(':
        stack.append(data[i])
    else:
        if data[i-1] == '(':
            stack.pop()
            stick += len(stack)
        else:
            stack.pop()
            stick += 1

print(stick)




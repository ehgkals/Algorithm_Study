import sys

input = sys.stdin.readline

N = int(input())
ex = input().rstrip()
stack = []
num = []

for i in range(N):
    num.append(int(input().rstrip()))

for c in ex:
    if c.isalpha():
        stack.append(num[ord(c) - ord('A')])

    else:
        y = stack.pop()
        x = stack.pop()

        if c == '+':
            stack.append(x + y)
        elif c == '-':
            stack.append(x - y)
        elif c == '*':
            stack.append(x * y)
        else:
            stack.append(x / y)

print(format(stack.pop(), ".2f"))
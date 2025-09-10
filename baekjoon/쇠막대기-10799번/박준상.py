import sys

input = sys.stdin.readline

stack = []
s = input().rstrip()
aws = 0

for i in range(len(s)):
    if s[i] == '(':
        stack.append(s[i])
    else:
        if i - 1 >= 0 and s[i - 1] == '(':
            stack.pop()
            aws += len(stack)
        else:
            stack.pop()
            aws += 1

print(aws)
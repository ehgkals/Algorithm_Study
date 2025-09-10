import sys

input = sys.stdin.readline

stack = []
par = False
answer = ''

S = input()

for s in S:
    if s == '<':
        par = True

        while len(stack) > 0:
            answer += stack.pop()
        answer += s
        continue

    elif s == '>':
        par = False
        answer += s
        continue

    if par == True:
        answer += s
        continue

    if s == ' ':
        while len(stack) > 0:
            answer += stack.pop()
        answer += ' '

    else:
        stack.append(s)

stack.pop()
while len(stack) > 0:
    answer += stack.pop()

print(answer)
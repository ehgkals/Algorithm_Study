import sys

input = sys.stdin.readline

infix = input().rstrip()
stack = []
post = ''
order = {'+': 1,  '-': 1, '*': 2, '/': 2}

for c in infix:
    if c.isalpha():
        post += c

    else:
        if c == ')':
            while stack[-1] != '(':
                post += stack.pop()
            stack.pop()
        elif len(stack) == 0 or c == '(' or stack[-1] == '(':
            stack.append(c)
        else:
            if order[c] > order[stack[-1]]:
                stack.append(c)
            else:
                while len(stack) > 0 and stack[-1] != '(' and order[c] <= order[stack[-1]]:
                    post += stack.pop()
                stack.append(c)

while len(stack) > 0:
    post += stack.pop()

print(post)
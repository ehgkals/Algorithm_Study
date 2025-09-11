data = list(input())

dic = {
    "+" : 1,
    "-" : 1,
    "*" : 2,
    "/" : 2
}

stack = []
ans = ''
for d in data:
    if 'A' <= d <= 'Z':
        ans += d
    else:
        if d == ')':
            while stack[-1] != '(':
                ans += stack.pop()
            stack.pop() 
        elif len(stack) == 0 or d == '(' or stack[-1] == '(':
            stack.append(d)
        else:
            if dic[stack[-1]] < dic[d]:
                stack.append(d)
            else:
                while len(stack) > 0 and stack[-1] != '(' and dic[stack[-1]] >= dic[d]:
                    ans += stack.pop()
                stack.append(d)
                
while len(stack) > 0:
    ans += stack.pop()
print(ans)
N = int(input())

data = list(input())

nums = []
for i in range(N):
    nums.append(int(input()))

stack = []

for d in data:
    if 'A' <= d <= 'Z':
        stack.append(nums[ord(d) - 65])
    else:
        second = stack.pop()
        first = stack.pop()
        if d == '+':
            stack.append(first + second)
        elif d == '-':
            stack.append(first - second)
        elif d == '/':
            stack.append(first / second)
        else:
            stack.append(first * second)

ans = stack.pop()
print(f'{ans:.2f}')
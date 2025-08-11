T = int(input())
divisor = []

divisor = list(map(int,input().split()))
divisor.sort()

print(divisor[0] * divisor[-1])
a, k = map(int, input().split())
ans = 0
while k > a:
    if k % 2 == 0 and k // 2 >= a:
        k //= 2
    else:
        k -= 1
    ans += 1
print(ans)


import sys
input = sys.stdin.readline

def is_pal(s, l, r):
    while l < r:
        if s[l] != s[r]:
            return False
        l += 1
        r -= 1
    return True

T = int(input())

for _ in range(T):
    s = input().strip()
    l, r = 0, len(s) - 1
    aws = 0

    while l < r:
        if s[l] == s[r]:
            l += 1
            r -= 1
        else:
            if is_pal(s, l + 1, r) or is_pal(s, l, r - 1):
                aws = 1
            else:
                aws = 2
            break

    print(aws)
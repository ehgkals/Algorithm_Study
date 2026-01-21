import sys
input = sys.stdin.readline

T = int(input())

for _ in range(T):
    p = input().strip()
    n = int(input())
    arr = input().strip()
    
    if n == 0:
        arr = []
    else:
        arr = list(map(int, arr[1:-1].split(',')))

    l, r = 0, len(arr) - 1
    rev = False

    for op in p:
        if op == 'R':
            rev = not rev
        else:
            if l > r:
                print('error')
                break
            elif not rev:
                l += 1
            else:
                r -= 1

    else:
        if not rev:
            print('[' + ','.join(map(str, arr[l:r+1])) + ']')
        else:
            print('[' + ','.join(map(str, arr[l:r+1][::-1])) + ']')
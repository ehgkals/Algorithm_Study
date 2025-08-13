n = int(input())
n_num = list(map(int, input().split()))
m = int(input())
m_num = list(map(int, input().split()))

for i in m_num:
    if (i in n_num):
        print(1, end=' ')
    else:
        print(0, end=' ')


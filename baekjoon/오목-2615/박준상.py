import sys

input = sys.stdin.readline

gomoku = []

for i in range(19):
    gomoku.append(list(map(int, input().split())))

dx = [-1, 0, 1, 1]
dy = [1, 1, 1, 0]

for i in range(19):
    for j in range(19):
        if gomoku[i][j] != 0:
            for k in range(4):
                nx = i + dx[k]
                ny = j + dy[k]
                cnt = 1

                while 0 <= nx < 19 and 0 <= ny < 19 and gomoku[nx][ny] == gomoku[i][j]:
                    nx = nx + dx[k]
                    ny = ny + dy[k]
                    px = i - dx[k]
                    py = j - dy[k]
                    cnt += 1

                    if cnt == 5:
                        if 0 <= px < 19 and 0 <= py < 19 and gomoku[px][py] == gomoku[i][j]:
                            break
                        if 0 <= nx < 19 and 0 <= ny < 19 and gomoku[nx][ny] == gomoku[i][j]:
                            break
                        print(gomoku[i][j])
                        print(i + 1, j + 1)
                        sys.exit(0)

print(0)
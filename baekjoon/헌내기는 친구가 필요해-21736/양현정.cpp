#include <iostream>
#include <vector>

using namespace std;
int N, M, sx, sy, cnt;
const int dx[4] = {1, 0, -1, 0};
const int dy[4] = {0, 1, 0, -1};
vector<vector<char>> mt;

void DFS(int x, int y)
{
    for (int i = 0; i < 4; ++i)
    {
        int nx = x + dx[i];
        int ny = y + dy[i];
        if (nx < 0 || nx >= N || ny < 0 || ny >= M || mt[nx][ny] == 'X')
            continue;

        if (mt[nx][ny] == 'P')
            cnt++;
        mt[nx][ny] = 'X';
        DFS(nx, ny);
    }
}

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cin >> N >> M;
    mt.resize(N, vector<char>(M));

    for (int i = 0; i < N; ++i)
    {
        for (int j = 0; j < M; ++j)
        {
            cin >> mt[i][j];
            if (mt[i][j] == 'I')
            {
                sx = i;
                sy = j;
            }
        }
    }

    DFS(sx, sy);
    if (cnt)
        cout << cnt;
    else
        cout << "TT";

    return 0;
}
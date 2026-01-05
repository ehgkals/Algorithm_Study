#include <iostream>
using namespace std;

const int dy[4] = {-1, 0, 1, 1};
const int dx[4] = {1, 1, 1, 0};
const int len = 20;

int cnt, pre, a[len][len];

int main()
{
    for (int i = 1; i < len; ++i)
    {
        for (int j = 1; j < len; ++j)
        {
            cin >> a[i][j];
        }
    }

    for (int i = 1; i < len; ++i)
    {
        for (int j = 1; j < len; ++j)
        {
            int s = a[i][j];
            if (s == 0)
                continue;
            for (int d = 0; d < 4; ++d)
            {
                cnt = 1;
                int ny = i + dy[d];
                int nx = j + dx[d];
                int py = i - dy[d];
                int px = j - dx[d];

                pre = (py < 1 || py >= len || px < 1 || px >= len) ? 0 : a[py][px];

                if (ny < 1 || ny >= len || nx < 1 || nx >= len)
                    continue;
                if (pre == s)
                    continue;
                while (ny >= 1 && ny < len && nx >= 1 && nx < len && a[ny][nx] == s)
                {
                    ny += dy[d];
                    nx += dx[d];
                    cnt++;
                }

                if (cnt == 5)
                {
                    if (ny >= 1 && ny < len && nx >= 1 && nx < len && a[ny][nx] == s)
                        continue;

                    cout << s << '\n';
                    cout << i << ' ' << j << '\n';
                    return 0;
                }
            }
        }
    }

    cout << 0 << '\n';
    return 0;
}
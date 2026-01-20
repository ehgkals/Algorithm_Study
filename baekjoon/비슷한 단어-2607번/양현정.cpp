#include <iostream>
#include <cstring>

using namespace std;

const int SIZE = 26;
int N, ret, p, m, a[SIZE], b[SIZE];
string s;
int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    cin >> N;
    cin >> s;
    for (char c : s)
    {
        a[(int)c - 65]++;
    }

    for (int i = 0; i < N - 1; ++i)
    {
        cin >> s;
        p = 0;
        m = 0;
        memset(b, 0, sizeof(b));
        for (char c : s)
        {
            b[(int)c - 65]++;
        }

        for (int j = 0; j < SIZE; ++j)
        {
            int diff = a[j] - b[j];
            if (diff < 0)
            {
                m += -diff;
            }
            else if (diff > 0)
            {
                p += diff;
            }
        }
        if ((p == 1 && m == 0) || (p == 0 && m == 0) || (p == 0 && m == 1) || (p == 1 && m == 1))
            ret++;
    }

    cout << ret;
    return 0;
}
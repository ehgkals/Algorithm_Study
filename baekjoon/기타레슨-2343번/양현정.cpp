#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int N, M, lt, rt, mid, slt, srt, cnt, mn;
int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    cin >> N >> M;
    vector<int> v(N), p(N + 1, 0);

    for (int i = 0; i < N; ++i)
    {
        cin >> v[i];
        p[i + 1] = v[i] + p[i];
        lt = max(lt, v[i]);
    }

    rt = p[N];
    mid = (lt + rt) / 2;
    mn = rt;
    while (lt <= rt)
    {
        cnt = 1;
        int preIdx = 0;
        mid = (lt + rt) / 2;
        for (int i = 1; i <= N; ++i)
        {
            if (p[i] - p[preIdx] > mid)
            {
                preIdx = i - 1;
                cnt++;
            }
        }
        if (cnt <= M)
        {
            rt = mid - 1;
            mn = min(mn, mid);
        }
        else
            lt = mid + 1;
    }

    cout << mn;
    return 0;
}
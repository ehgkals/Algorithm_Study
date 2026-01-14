#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int N;
long long M, tmp, sum, ret, lt, rt, mid;
int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    cin >> N;
    vector<long long> v(N), p(N + 1, 0);
    for (int i = 0; i < N; ++i)
    {
        cin >> v[i];
        p[i + 1] = p[i] + v[i];
    }
    cin >> M;

    if (M == p[N])
    {
        cout << v[N - 1];
        return 0;
    }
    sort(v.begin(), v.end());

    lt = 1;
    rt = v[N - 1];
    ret = (lt + rt) / 2;
    while (lt <= rt)
    {
        sum = 0;

        mid = (lt + rt) / 2;
        int idx = upper_bound(v.begin(), v.end(), mid) - v.begin();
        sum = p[idx] + mid * (long long)(N - idx);
        if (sum <= M)
        {
            lt = mid + 1;
            ret = mid;
        }
        else if (sum > M)
            rt = mid - 1;
    }

    cout << ret;

    return 0;
}
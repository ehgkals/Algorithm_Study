#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int T, N, a, b;
int main()
{
    cin >> T;
    while (T--)
    {
        cin >> N;
        vector<pair<int, int>> v;
        int ret = 1;
        for (int i = 0; i < N; ++i)
        {
            cin >> a >> b;
            v.push_back({a, b});
        }

        sort(v.begin(), v.end());

        int s = v[0].second;
        for (auto x : v)
        {
            if (x.second < s)
            {
                s = x.second;
                ret++;
            }
        }
        cout << ret << '\n';
    }

    return 0;
}
#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int n;
int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    cin >> n;

    vector<int> squares;
    for (int i = 1; i * i <= n; i++)
        squares.push_back(i * i);

    vector<int> dp(n + 1);
    for (int i = 1; i <= n; i++)
    {
        dp[i] = INT32_MAX;
        for (int sq : squares)
        {
            if (sq > i)
                break;
            dp[i] = min(dp[i], dp[i - sq] + 1);
        }
    }

    cout << dp[n];
    return 0;
}
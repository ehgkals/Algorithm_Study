#include<iostream>
#include<vector>

using namespace std;

int n;
int main() {
    cin >> n;

    vector<int> dp(n + 1, 0);
    dp[1] = 1;
    if (n >= 2) dp[2] = 3;

    for(int i = 3; i<=n; ++i) {
        dp[i] = (dp[i-1] + 2 * dp[i-2]) % 10007;
    }
    // 모듈러 연산을 cout에서 했다가
    // 오버플로때문에 틀렸었음

    cout << dp[n];
}
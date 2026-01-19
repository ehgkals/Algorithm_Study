#include<bits/stdc++.h>

using namespace std;

int dp[1001][1001];

string S, T;
int main() {
    ios::sync_with_stdio(false);
    cin.tie(NULL);

    cin >> S >> T;

    int n = S.size();
    int t = T.size();
    
    for (int i = 1; i <= n; ++i) {
        for(int j = 1; j <= t; ++j){
            if (S[i - 1] == T[j - 1]){
                dp[i][j] = dp[i - 1][j - 1] + 1;
            } else {
                dp[i][j] = max(dp[i - 1][j], dp[i][j - 1]);
            }
        }
    }

    cout << dp[n][t];

    return 0;
}
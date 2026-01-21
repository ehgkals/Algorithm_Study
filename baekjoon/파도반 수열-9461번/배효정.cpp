#include<iostream>
#include<algorithm>

using namespace std;

int T, N;
long long dp[101] = {0};
// long long이 아니라 int로 변수 잡았더니
// 오버플로 발생해서 틀림

int main() {
    ios::sync_with_stdio(false);
    cin.tie(NULL);

    cin >> T;
    while(T--) {
        cin >> N;

        for(int i = 1; i < 4; ++i) {
            dp[i] = 1;
        }

        for(int i = 4; i < 6; ++i) {
            dp[i] = 2;
        }

        for(int i = 6; i <= N; ++i) {
            dp[i] = dp[i - 1] + dp[i - 5];
        }

        cout << dp[N] << "\n";
    }

    return 0;
}
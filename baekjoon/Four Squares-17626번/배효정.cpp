#include<iostream>
#include<vector>
#include<cmath>

using namespace std;

int n;
int st;
int main() {
    cin >> n; 

    vector<int> dp(n + 1, 1e9);
    dp[0] = 0;

    for(int i = 1; i <= n; ++i){
        for(int j = 1; j * j <= i; ++j){
            dp[i] = min(dp[i], dp[i - pow(j, 2)] + 1);     
            } 
    }

    cout << dp[n];
}
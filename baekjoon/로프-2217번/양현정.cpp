#include<iostream>
#include<vector>
#include<algorithm>

using namespace std;

int main() {
    int n;
    cin >> n;
    vector<int> v(n);
    for (int i = 0; i < n; ++i) cin >> v[i];
    sort(v.begin(), v.end());

    long long mx = 0;
    for (int i = 0; i < n; ++i) {
        mx = max(mx, 1LL * v[i] * (n - i));
    }
    cout << mx;
    return 0;
}
#include <bits/stdc++.h>
#include <iostream>

using namespace std;
typedef long long ll;

int N;
ll M;

int main (){
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    cin >> N;

    vector<int> v(N);
    for(int i = 0; i < N; ++i){
        cin >> v[i];
    }

    cin >> M;

    ll ret = 0;
    sort(v.begin(), v.end());

    ll left = 0 , right = v[N-1];
     
    while(left <= right) {
        ll mid = (left + right) / 2;
        ll sum = 0;

        for(int i = 0; i < N; i++){
            sum += min((ll)v[i], mid);
        }

        if (sum <= M) {
            ret = mid; 
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }

    cout << ret;

    return 0;
}
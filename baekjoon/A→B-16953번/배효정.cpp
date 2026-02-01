#include<bits/stdc++.h>

using namespace std;

typedef long long ll;

ll a, b, cur;
int cnt;

int main(){
    cin >> a >> b;

    queue<pair<ll ,int >> q;
    q.push({a, 1});

    while(!q.empty()){
        tie(cur, cnt) = q.front(); q.pop();

        if(cur == b){
            cout << cnt;
            return 0;
        }

        if(cur > b) continue;

        q.push({cur * 2, cnt + 1});
        q.push({cur * 10 + 1 , cnt + 1});
    }

    cout << -1;

    return 0;
}
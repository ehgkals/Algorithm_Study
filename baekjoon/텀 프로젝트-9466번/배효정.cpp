#include<bits/stdc++.h>

using namespace std;

int T, n, cnt;

int a[100001];
int visited[100001];

void dfs(int here){
    visited[here] = 1;
    int there = a[here];

    if(visited[there] == 0) dfs(there);
    else if(visited[there] == 1){
        for(int i = there; i != here; i = a[i]){
            cnt++;
        }
        cnt++;
    }

    visited[here] = 2;
}

int main(){
    cin >> T;

    while(T--){
        cin >> n;

        cnt = 0;
        memset(visited, 0, sizeof(visited));
        memset(a, 0, sizeof(a));

        for(int i = 1; i <=n; ++i){
            cin >> a[i];
        }

        for(int i = 1; i <=n; ++i){
            if(!visited[i]) dfs(i);
        }

        cout << n - cnt << "\n";
    }

    return 0;
}
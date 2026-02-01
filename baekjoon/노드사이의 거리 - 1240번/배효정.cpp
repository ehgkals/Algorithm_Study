#include<bits/stdc++.h>

using namespace std;

int n, m, t1, t2, w, n1, n2;
vector<int> a[1001];
map<pair<int, int>, int> mp;
queue<pair<pair<int, int>, int>> q;

int main(){
    ios::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
    cin >> n >> m;

    for(int i = 0; i < n - 1; ++i){
        cin >> t1 >> t2 >> w;
        a[t1].push_back(t2);
        a[t2].push_back(t1);

        mp[{t1, t2}] = w;
        mp[{t2, t1}] = w;
    }

    for(int i = 0; i < m; ++i){
        cin >> n1 >> n2; 

        queue<int> q;
        int visited[1001] = {0};
        visited[n1] = 1;
        q.push(n1);
        while(!q.empty()){
            int u = q.front(); q.pop();

            for(int i : a[u]){
                if(!visited[i]){
                    int w = mp[{u, i}];
                    visited[i] = visited[u] + w;
                    q.push(i);
                }
            }
        }

        cout << visited[n2] - 1 << "\n";
    }
     

    return 0;
}
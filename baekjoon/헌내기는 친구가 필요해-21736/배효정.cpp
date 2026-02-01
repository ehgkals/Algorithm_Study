#include<bits/stdc++.h>

using namespace std;

int n, m, x, y, ret;

int dy[] = {-1, 0, 1, 0};
int dx[] = {0, 1, 0, -1};

char a[601][601];
bool visited[601][601];

void dfs(int y, int x){
    visited[y][x] = 1;
    if(a[y][x] == 'P') ret++;

    for(int i = 0; i < 4; ++i){
        int ny = y + dy[i];
        int nx = x + dx[i];
   
        if(ny < 0 || nx < 0 || ny >= n || nx >= m) continue;
        if(!visited[ny][nx] && (a[ny][nx] == 'O' || a[ny][nx] == 'P')){
            dfs(ny, nx);
        }
    }
}


int main(){
    cin >> n >> m;

    for(int i = 0; i < n; ++i){
        for(int j = 0; j < m; ++j){
            cin >> a[i][j];
            if(a[i][j] == 'I'){
                y = i;
                x = j;
            }
        }
    }

    dfs(y,x);

    if(ret == 0){
        cout << "TT";
    } else{
        cout << ret; 
    }
    return 0;
}
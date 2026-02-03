#include <iostream>
#include <queue>

using namespace std;

int N, M, ret, a, b;
vector<vector<int>> v;
void DFS(int node, int prev)
{
    if (v[node][a])
    {
        ret += v[node][a];
        return;
    }

    for (int i = 1; i <= N; i++)
    {
        if (v[node][i] && i != prev)
        {
            ret += v[node][i];
            DFS(i, node);
            return;
        }
    }
}

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    cin >> N >> M;
    v.resize(N + 1, vector<int>(N + 1));

    for (int i = 0; i < N - 1; i++)
    {
        cin >> a >> b;
        cin >> v[a][b];
        v[b][a] = v[a][b];
    }

    for (int i = 0; i < M; i++)
    {
        cin >> a >> b;

        if (v[a][b])
            cout << v[a][b] << '\n';
        else
        {
            DFS(b, a);
            cout << ret << '\n';
        }
    }

    return 0;
}

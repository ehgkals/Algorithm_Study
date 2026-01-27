#include <iostream>
#include <vector>

using namespace std;

int n;
vector<int> v;

int mn = 4;
void DFS(int L, int num)
{
    if (L == 4)
    {
        return;
    }

    int remainder = 0;
    for (int a : v)
    {
        if (mn <= L)
            continue;
        remainder = num - a;
        if (remainder == 0)
        {
            if (mn > L)
                mn = L;
            return;
        }
        DFS(L + 1, remainder);
    }
}

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    cin >> n;
    int s = 1;
    while (s * s <= n)
    {
        v.push_back(s * s);
        s++;
    }

    DFS(1, n);
    cout << mn;

    return 0;
}
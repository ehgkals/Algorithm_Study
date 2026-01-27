#include <iostream>
#include <vector>

using namespace std;

int T, N;
int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    cin >> T;
    vector<long long> v;
    v.push_back(0);
    v.push_back(1);
    v.push_back(1);
    v.push_back(1);
    v.push_back(2);

    for (int j = 5; j <= 100; j++)
    {
        v.push_back(v[j - 1] + v[j - 5]);
    }

    while (T--)
    {
        cin >> N;
        cout << v[N] << '\n';
    }

    return 0;
}
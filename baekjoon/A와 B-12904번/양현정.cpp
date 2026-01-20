#include <iostream>
#include <cstring>

using namespace std;

int T;
string S;

static inline bool isPal(int l, int r)
{
    while (l < r)
    {
        if (S[l] != S[r])
            return false;
        l++;
        r--;
    }
    return true;
}
int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    cin >> T;
    while (T--)
    {
        cin >> S;
        int l = 0;
        int r = (int)S.size() - 1;
        while (l < r && S[l] == S[r])
        {
            l++;
            r--;
        }

        if (l >= r)
        {
            cout << 0 << '\n';
            continue;
        }

        if (isPal(l + 1, r) || isPal(l, r - 1))
        {
            cout << 1 << '\n';
        }
        else
        {
            cout << 2 << '\n';
        }
    }
    return 0;
}
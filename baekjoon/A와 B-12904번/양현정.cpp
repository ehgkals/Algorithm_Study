#include <iostream>
#include <deque>
#include <cstring>

using namespace std;

string S, T;

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    cin >> S >> T;
    size_t ssz = S.length();
    deque<char> dq;
    for (char c : T)
    {
        dq.push_back(c);
    }

    bool rev = false;
    while (ssz < dq.size())
    {
        char last = (!rev ? dq.back() : dq.front());
        if (!rev)
            dq.pop_back();
        else
            dq.pop_front();

        if (last == 'B')
            rev = !rev;
    }
    for (int i = 0; i < (int)S.size(); ++i)
    {
        char c = (!rev ? dq[i] : dq[dq.size() - 1 - i]);
        if (c != S[i])
        {
            cout << 0;
            return 0;
        }
    }
    cout << 1;

    return 0;
}
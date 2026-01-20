#include <iostream>
#include <deque>
#include <cstring>

using namespace std;

int T, N;
string P, X;

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    cin >> T;

    while (T--)
    {
        bool s = true;
        cin >> P;
        cin >> N >> X;
        deque<int> dq;

        int num = 0;
        bool inNumber = false;
        for (char c : X)
        {
            if ('0' <= c && c <= '9')
            {
                num = num * 10 + (c - '0');
                inNumber = true;
            }
            else
            {
                if (inNumber)
                {
                    dq.push_back(num);
                    num = 0;
                    inNumber = false;
                }
            }
        }

        bool flag = 0;
        for (char c : P)
        {
            if (c == 'R')
                s = !s;
            else
            {
                if (dq.empty())
                {
                    cout << "error\n";
                    flag = 1;
                    break;
                }
                if (s)
                {
                    dq.pop_front();
                }
                else
                {
                    dq.pop_back();
                }
            }
        }
        if (flag)
            continue;
        int sz = dq.size();
        cout << "[";
        for (int i = 0; i < sz; ++i)
        {
            if (s)
            {
                cout << dq.front();
                dq.pop_front();
            }
            else
            {
                cout << dq.back();
                dq.pop_back();
            }
            if (i < sz - 1)
                cout << ",";
        }
        cout << "]\n";
    }
    return 0;
}
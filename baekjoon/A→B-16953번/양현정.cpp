#include <iostream>
#include <queue>

using namespace std;

int A, B, cnt;
queue<long long> q;
int BFS()
{
    q.push(A * 2);
    q.push(A * 10 + 1);

    while (!q.empty())
    {
        cnt++;
        int q_sz = q.size();

        for (int i = 0; i < q_sz; i++)
        {
            long long n = q.front();
            q.pop();

            if (n == B)
                return cnt + 1;

            long long first = n * 2;
            long long second = n * 10 + 1;

            if (first <= B)
                q.push(first);
            if (second <= B)
                q.push(second);
        }
    }

    return -1;
}

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    cin >> A >> B;

    cout << BFS();

    return 0;
}

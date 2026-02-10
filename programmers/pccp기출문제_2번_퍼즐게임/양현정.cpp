#include <string>
#include <vector>
#include <iostream>
#include <algorithm>

using namespace std;

int solution(vector<int> diffs, vector<int> times, long long limit)
{
    int answer = 0;
    int lt, rt, prev, level;
    int loopCnt;

    lt = *min_element(diffs.begin(), diffs.end());
    rt = *max_element(diffs.begin(), diffs.end());
    while (lt <= rt)
    {
        level = (lt + rt) / 2;
        long long sum = 0;
        for (int i = 0; i < diffs.size(); i++)
        {
            loopCnt = diffs[i] - level;
            prev = i > 0 ? times[i - 1] : 0;
            if (loopCnt > 0)
            { // 반복
                sum += loopCnt * (times[i] + prev);
            }
            sum += times[i];
        }
        if (sum < limit)
        {
            rt = level - 1;
            answer = level;
        }
        else if (sum > limit)
        {
            lt = level + 1;
        }
        else
        {
            return level;
        }
    }

    return answer;
}
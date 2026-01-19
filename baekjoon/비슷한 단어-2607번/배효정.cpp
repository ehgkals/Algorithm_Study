#include <bits/stdc++.h>

using namespace std;

int N;
string target;
int ret = 0;
int main(){
    cin >> N >> target;

    vector<int> targetCnt(26 , 0);
    for(char c : target){
        targetCnt[c - 'A']++;
    }

    for(int i = 0; i < N - 1; ++i){
        string word;
        cin >> word;

        vector<int> cnt(26, 0);
        for(char c : word){
            cnt[c - 'A']++;
        }

        int diff = 0;
        for(int j = 0; j < 26; ++j){
            diff += abs(targetCnt[j] - cnt[j]);
        }

        int lenDiff = abs((int)target.length() - (int)word.length());
        if (lenDiff == 0 && diff <= 2) ret++;
        else if(lenDiff == 1 && diff <= 1) ret++;
    }
    
    cout << ret;

    return 0;
}
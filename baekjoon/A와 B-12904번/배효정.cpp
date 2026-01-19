#include<bits/stdc++.h>

using namespace std;

string S, T;
int main(){
    ios::sync_with_stdio(false);
    cin.tie(NULL);

    cin >> S >> T;

    // A -> 제거
    // B -> 제거 후 리버스
    while(T.size() > S.size()) {
        if (T.back() == 'A') {
            T.pop_back();
        }
        else if (T.back() == 'B') {
            T.pop_back();
            reverse(T.begin(), T.end());
        }
    } 

    cout << (T == S ?  1 : 0);

    return 0;
}
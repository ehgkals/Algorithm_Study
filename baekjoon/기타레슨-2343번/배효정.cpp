#include <bits/stdc++.h>
#include <iostream>

using namespace std;

int N;
int M;

int main (){
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    cin >> N >> M;

    vector<int> v(N);
    int left = 0, right = 0;

    for(int i = 0; i < N; ++i){
        cin >> v[i];
        left = max(left, v[i]);
        right += v[i];
    }

    int ret = right;
    while(left <= right) {
    
        int mid = (left + right) / 2;

        int cnt = 1;
        int sum = 0;

        for(int i = 0; i < N; i++){
            if (sum + v[i] > mid) {
                cnt++;
                sum = v[i];
            } else{
                sum += v[i];
            }
        } 

        if (cnt <= M) {
            ret = mid;
            right = mid - 1;
        } else {
            left = mid + 1;
        }
    }

    cout << ret;

    return 0;
}
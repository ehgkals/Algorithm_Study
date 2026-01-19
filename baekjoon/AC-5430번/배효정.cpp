#include <bits/stdc++.h>

using namespace std;

int T, N;
string fs;
string nums;

vector<string> split(const string& input, string delimeter) {
    vector<string> result;
    auto start = 0;
    auto end = input.find(delimeter);
    while(end != string::npos){
        result.push_back(input.substr(start, end - start));
        start = end + delimeter.size();
        end = input.find(delimeter, start);
    }
    result.push_back(input.substr(start));
    return result;
}
int main(){
    ios::sync_with_stdio(false);
    cin.tie(NULL);

    cin >> T;
    for(int test_case = 0; test_case < T; ++test_case){
        cin >> fs;
        cin >> N;
        cin >> nums;

        nums.erase(nums.begin());
        nums.erase(nums.end() - 1);

        deque<string> numbers;
        if (!nums.empty()) {
            vector<string> temp = split(nums, ",");
            for (auto &s: temp) numbers.push_back(s);
        }

        bool rev = false;
        bool error  = false;

        for(char f : fs) {
            if (f == 'R') {
                // reverse(numbers.begin(), numbers.end()); // 시간 초과
                rev = !rev;
            } else if (f == 'D') {
                if (numbers.empty()){
                    error = true;
                    break;
                }
                // if (!rev) numbers.erase(numbers.begin()); // 시간 초과
                if (!rev) numbers.pop_front();
                else numbers.pop_back();
            }
        }

        if (error) {
            cout << "error\n";
            continue;
        }

        cout << "[";
        if (!rev) {
            for(int i = 0; i < numbers.size(); ++i){
                cout << numbers[i];
                if (i != numbers.size() - 1) cout << ",";
            } 
        } else {
                for (int i = numbers.size() - 1; i >=0; --i){
                    cout << numbers[i];
                    if (i != 0) cout << ",";
                }
            }
        cout << "]\n";

    }

    return 0;
}
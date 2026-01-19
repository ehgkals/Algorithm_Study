#include<bits/stdc++.h>

using namespace std;

int T;

bool isTrue(const string &s, int i, int j) {
    while (i < j) {
        if (s[i] != s[j]) return false;
        i++;
        j--; 
    }
    return true;
}

int main() {
    cin >> T;

    for(int i = 0; i < T; ++i) {
        string sentence;
        cin >> sentence;
        
        int ret = 0;

        int halfLen = sentence.length() / 2;
        for(int j = 0; j < halfLen; ++j){
            // if(sentence.front() == sentence.back()){
            //     sentence.erase(sentence.begin());
            //     sentence.erase(sentence.end());
            //     continue;
            // } else {

            // }
            if (sentence[j] == sentence[sentence.length() - j - 1]) continue;
            else {
                if (isTrue(sentence, j, sentence.length() - j - 2) || isTrue(sentence, j + 1, sentence.length() - j - 1)) ret = 1;
                else {
                    ret = 2;
                }
                break;
            }
        }

        cout << ret << "\n";
    }
}
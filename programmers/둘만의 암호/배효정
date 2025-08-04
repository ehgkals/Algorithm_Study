#include <string>
#include <vector>
using namespace std;

string solution(string s, string skip, int index) {
    bool isSkip[26] = { false };
    for (char c : skip) {
        isSkip[c - 'a'] = true;
    }

    string result;
    for (char ch : s) {
        int count = 0;
        char nextChar = ch;
        while (count < index) {
            nextChar = (nextChar == 'z') ? 'a' : nextChar + 1;
            if (!isSkip[nextChar - 'a']) {
                count++;
            }
        }
        result += nextChar;
    }

    return result;
}
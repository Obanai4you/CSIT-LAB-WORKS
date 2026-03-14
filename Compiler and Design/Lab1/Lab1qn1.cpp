//wrirte a program to construct DFA that accept string 1010 in c++ language 

#include <iostream>
#include <string>
using namespace std;

bool dfa_accepts_1010(const string& input) {
    int state = 0;

    for (int i = 0; i < input.length(); ++i) {
        char ch = input[i];
        switch (state) {
            case 0:
                if (ch == '1') state = 1;
                else return false;
                break;
            case 1:
                if (ch == '0') state = 2;
                else return false;
                break;
            case 2:
                if (ch == '1') state = 3;
                else return false;
                break;
            case 3:
                if (ch == '0') state = 4;
                else return false;
                break;
            case 4:
                return false; // string longer than 1010
        }
    }

    return (state == 4); // accept only if ends at final state
}

int main() {
    string input;
    cout << "Enter a binary string: ";
    cin >> input;

    if (dfa_accepts_1010(input)) {
        cout << "Accepted: String matches 1010." << endl;
    } else {
        cout << "Rejected: String does not match 1010." << endl;
    }

    return 0;
}


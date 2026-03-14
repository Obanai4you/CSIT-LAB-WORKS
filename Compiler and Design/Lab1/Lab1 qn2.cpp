//Q2. wrirte a program to construct DFA that accept string start with a and end with b.

#include <iostream>
#include <string>
using namespace std;

bool dfa_startsWithA_endsWithB(const string& input) {
    if (input.length() < 2) {
        return false; // String must be at least 2 characters long
    }

    if (input[0] == 'a' && input[input.length() - 1] == 'b') {
        // Check if all characters are 'a' or 'b'
        for (int i = 0; i < input.length(); i++) {
            if (input[i] != 'a' && input[i] != 'b') {
                return false; // Invalid character found
            }
        }
        return true; // Valid string
    }

    return false; // Doesn't start with 'a' or end with 'b'
}

int main() {
    string input;
    cout << "Enter a string (only a and b): ";
    cin >> input;

    if (dfa_startsWithA_endsWithB(input)) {
        cout << "Accepted: String starts with 'a' and ends with 'b'." << endl;
    } else {
        cout << "Rejected: String doesn't start with 'a' and end with 'b'." << endl;
    }

    return 0;
}


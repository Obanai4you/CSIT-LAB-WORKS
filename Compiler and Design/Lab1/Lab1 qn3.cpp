//Q3. wrirte a program to convert (a+b)*abb into DFA using direct method.

#include <iostream>
#include <string>
using namespace std;

// DFA states
enum State { q0, q1, q2, q3 };

// Function to simulate DFA
bool dfa_match_abb(const string& input) {
    State current = q0;

    for (int i = 0; i < input.length(); ++i) {
        char ch = input[i];

        switch (current) {
            case q0:
                if (ch == 'a') current = q1;
                else if (ch == 'b') current = q0;
                else return false;
                break;

            case q1:
                if (ch == 'a') current = q1;
                else if (ch == 'b') current = q2;
                else return false;
                break;

            case q2:
                if (ch == 'a') current = q1;
                else if (ch == 'b') current = q3;
                else return false;
                break;

            case q3:
                if (ch == 'a') current = q1;
                else if (ch == 'b') current = q3;
                else return false;
                break;
        }
    }

    return (current == q3);
}

int main() {
    string input; 
    cout << "Enter a string (only a and b): ";
    cin >> input;

    if (dfa_match_abb(input)) {
        cout << "Accepted: String matches (a+b)*abb" << endl;
    } else {
        cout << "Rejected: String does not match (a+b)*abb" << endl;
    }

    return 0;
}


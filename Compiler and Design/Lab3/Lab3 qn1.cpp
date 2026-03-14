//"Write a C++ program to check whether a grammar contains left recursion and determine if the grammar is LL(1)."

#include <iostream>
#include <string>
using namespace std;

// Function to check if a production has left recursion
bool hasLeftRecursion(const string &production) {
    char nonTerminal = production[0];         // LHS non-terminal
    string rightSide = production.substr(3);  // RHS after "->"

    int i = 0;
    while (i < rightSide.length()) {
        // If RHS starts with the same non-terminal -> left recursion
        if (rightSide[i] == nonTerminal)
            return true;

        // Move to the next alternative (after '|')
        int nextPipe = rightSide.find('|', i);
        if (nextPipe == string::npos)
            break;
        i = nextPipe + 1;
    }
    return false;
}

int main() {
    string productions[] = {
        "E->E+T|T",
        "T->T*F|F",
        "F->(E)|id"
    };

    int n = sizeof(productions) / sizeof(productions[0]);
    bool isLL1 = true;

    cout << "Checking grammar productions...\n\n";

    for (int i = 0; i < n; i++) {
        if (hasLeftRecursion(productions[i])) {
            cout << "? Left recursion detected in: " << productions[i] << endl;
            isLL1 = false;
        } else {
            cout << "? No left recursion in: " << productions[i] << endl;
        }
    }

    cout << "\nResult: ";
    if (isLL1)
        cout << "? Grammar is LL(1)." << endl;
    else
        cout << "? Grammar is NOT LL(1)." << endl;

    return 0;
}

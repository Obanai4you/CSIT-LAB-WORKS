//1. write a program to compute first of grammar.

#include <iostream>
#include <map>
#include <set>
#include <vector>
#include <string>
#include <cctype>  // For isupper()

using namespace std;

map<char, vector<string>> grammar;
map<char, set<char>> firstSet;

// Function to compute FIRST of a non-terminal
void computeFirst(char symbol) {
    if (!firstSet[symbol].empty())
        return;

    for (const string &prod : grammar[symbol]) {
        if (prod == "#") {
            firstSet[symbol].insert('#');
            continue;
        }

        for (int i = 0; i < prod.size(); ++i) {
            char ch = prod[i];

            if (!isupper(ch)) {
                firstSet[symbol].insert(ch);
                break;
            } else {
                computeFirst(ch);
                bool hasEpsilon = false;
                for (char f : firstSet[ch]) {
                    if (f == '#') hasEpsilon = true;
                    else firstSet[symbol].insert(f);
                }

                if (!hasEpsilon)
                    break;
                if (i == prod.size() - 1 && hasEpsilon)
                    firstSet[symbol].insert('#');
            }
        }
    }
}

int main() {
    int n;
    cout << "Enter number of productions: ";
    cin >> n;

    cout << "Enter productions (Format: A->aB or A-># for epsilon):\n";
    for (int i = 0; i < n; ++i) {
        string prod;
        cin >> prod;

        char lhs = prod[0];
        string rhs = prod.substr(3);
        grammar[lhs].push_back(rhs);
    }

    cout << "\nFIRST sets:\n";
    for (const auto &rule : grammar) {
        computeFirst(rule.first);
        cout << "FIRST(" << rule.first << ") = { ";
        for (char ch : firstSet[rule.first]) {
            cout << ch << " ";
        }
        cout << "}\n";
    }

    return 0;
}

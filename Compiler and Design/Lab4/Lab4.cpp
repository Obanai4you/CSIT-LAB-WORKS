#include <iostream>
#include <vector>
#include <string>
using namespace std;

bool reduce(vector<string> &stack) {
    if (stack.size() >= 1 && stack.back() == "id") {
        stack.back() = "F";
        cout << "Reduce: F -> id\n";
        return true;
    }

    if (stack.size() >= 1 && stack.back() == "F") {
        stack.back() = "T";
        cout << "Reduce: T -> F\n";
        return true;
    }
    if (stack.size() >= 1 && stack.back() == "T") {
        stack.back() = "E";
        cout << "Reduce: E -> T\n";
        return true;
    }

        if (stack.size() >= 3 &&
        stack[stack.size() - 3] == "T" &&
        stack[stack.size() - 2] == "*" &&
        stack[stack.size() - 1] == "F") {
        stack.erase(stack.end() - 3, stack.end());
        stack.push_back("T");
        cout << "Reduce: T -> T * F\n";
        return true;
    }

    if (stack.size() >= 3 &&
        stack[stack.size() - 3] == "E" &&
        stack[stack.size() - 2] == "+" &&
        stack[stack.size() - 1] == "T") {
        stack.erase(stack.end() - 3, stack.end());
        stack.push_back("E");
        cout << "Reduce: E -> E + T\n";
        return true;
    }

    return false;
}

int main() {
    vector<string> input = {"id", "+", "id", "*", "id", "$"};
    vector<string> stack;
    int i = 0;

    cout << "Shift-Reduce Parsing for: id + id * id\n\n";

    while (i < input.size()) {
        stack.push_back(input[i]);
        cout << "Shift: ";
        for (const string &s : stack)
            cout << s << " ";
        cout << "\n";
        i++;
        
        while (reduce(stack)) {
            cout << "Stack after reduction: ";
            for (const string &s : stack)
                cout << s << " ";
            cout << "\n";
        }
    }

    if (stack.size() == 1 && stack[0] == "E") {
        cout << "\nInput string ACCEPTED.\n";
    } else {
        cout << "\nInput string REJECTED.\n";
    }

    return 0;
}
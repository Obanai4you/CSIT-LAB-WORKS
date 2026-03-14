#include<iostream>
using namespace std;

int fact(int x, int &steps)
{
    steps++; // Increment step counter for each call
    if (x == 1)
    {
        return 1;
    }
    else
    {
        return x * fact(x - 1, steps);
    }
}

int main()
{
    int n, steps = 0;

    cout << "Enter a number: ";
    cin >> n;

    if (n < 0)
    {
        cout << "Factorial is not defined for negative numbers." << endl;
        return 1;
    }
    int result = fact(n, steps);

    cout << "Factorial of " << n << " is " << result << endl;
    cout << "Number of steps taken: " << steps << endl;

    return 0;
}

#include <iostream>
using namespace std;

// Function to compute GCD and find x, y such that ax + by = GCD(a, b)
int extendedGCD(int a, int b, int &x, int &y)
{
    if (a == 0)
    {
        x = 0, y = 1;
        return b;
    }
    int x1, y1;
    int gcd = extendedGCD(b % a, a, x1, y1);

    x = y1 - (b / a) * x1;
    y = x1;

    return gcd;
}

int main()
{
    int a, b, x, y;
    cout << "Enter two numbers: ";
    cin >> a >> b;

    int gcd = extendedGCD(a, b, x, y);

    cout << "GCD of " << a << " and " << b << " is: " << gcd << endl;
    cout << "Coefficients x and y are: " << x << " and " << y << endl;

    return 0;
}
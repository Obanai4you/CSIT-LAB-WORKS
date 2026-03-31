#include <iostream>
#include <cstdlib>

using namespace std;
long long powerMod(long long x, long long y, long long p)
{
    long long res = 1;
    x = x % p;
    while (y > 0)
    {
        if (y & 1)
            res = (res * x) % p;
        y = y >> 1;
        x = (x * x) % p;
    }
    return res;
}


bool millerTest(long long d, long long n)
{
    long long a = 2 + rand() % (n - 4);
    long long x = powerMod(a, d, n);
    if (x == 1 || x == n - 1)
        return true;

    while (d != n - 1)
    {
        x = (x * x) % n;
        d *= 2;
        if (x == 1)
            return false;
        if (x == n - 1)
            return true;
    }
    return false;
}

bool isPrime(long long n, int k)
{
    if (n <= 1 || n == 4)
        return false;
    if (n <= 3)
        return true;

    long long d = n - 1;
    while (d % 2 == 0)
        d /= 2;

    for (int i = 0; i < k; i++)
    {
        if (!millerTest(d, n))
            return false;
    }
    return true;
}

int main()
{
    long long num;
    cout << "Enter a number: ";
    cin >> num;

    int k = 5; 
    if (isPrime(num, k))
        cout << num << " is a prime number." << endl;
    else
        cout << num << " is a composite number." << endl;

    return 0;
}
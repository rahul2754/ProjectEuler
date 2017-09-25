#include <iostream>
#include <cmath>

using namespace std;

bool T(unsigned long long a);   //Prototype for functions.
bool P(unsigned long long a);

int main()
{

    for (unsigned int i = 144; ; i++)   //Initiate loop for calculating values of HEXAGONAL series only. Loop starting from the successor of existing first given type of term for the very second value.
    {
        unsigned int hex = i * (2*i - 1);
        if (P(hex))
        {
            cout << "The required term is " << hex << endl;
            return 0; // Stop the entire program as soon as any such first term is found.
        }
    }
}

bool T(unsigned long long a)    //Since function already ran first, it flags all values when a number satisfies the TRIANGLE equation, these values are used later on by the next function which is run immediately after T.
{
    unsigned long long n = sqrt(2*a);   //Equations for series compared and balanced(1)
    
    unsigned long long flag = n * (n + 1) / 2;
    return (a == flag);
}

bool P(unsigned long long a) //THe function uses the parameter provided by the HEXAGONAL series and when the parameter satisfies PENTAGONAL & TRIANGULAR series i.e. when 'termp' and 'a' are both equal, it returns TRUE.
{
    unsigned long long n = (1 + sqrt(24*a + 1)) / 6;    //Equations for series compared and balanced(2).
    
    auto termp = n * (3 * n - 1) / 2;   //Usage of Auto datatype assignment because certain values may provide accuracy fallacies.
    return (termp == a);
}

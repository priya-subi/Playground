#include <iostream>
using namespace std;
int Power(int, int);

int main()
{
    int a,n,p;
    std::cout << "Enter the value of a"<<"\n";
    std::cin>>a;
    std::cout<< "Enter the value of n"<<"\n";
    std::cin>>n;
    p=Power(a,n);
    cout<<"The value of "<<a<<" power "<<n<<" is "<<p;
    return 0;
}

int Power(int a, int n)
{
    if (n!= 0)
    {
        return (a*Power(a,n-1));
    }
    else
    {
        return 1;
    }
}
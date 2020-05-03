#include<iostream>
using namespace std;
int main()
{
  int n,target,sum=0,c=0;
  std::cin>>target;
    while(1)
    {
       std::cin>>n;
        sum=sum+n;
        c=c+1;
        if(sum>=target)
        {
            break;
        }
    }
    std::cout<<"The number of turns is "<<c;
    return 0;
}

  

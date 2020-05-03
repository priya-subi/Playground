#include<iostream>
using namespace std;
int main()
{
  int n,c,sum=0;
  std::cin>>n;
  int a[n],i;
  for(i=0;i<n;i++)
  {
    std::cin>>a[i];
  }
  c=a[0];
  std::cout<<"1"<<"\n";
  for(i=1;i<n;i++)
  {
    if(c>a[i])
    {
      std::cout<<"1"<<"\n";
      c=a[i];
    }
    else
    {
      c=a[i];
      sum=sum+2;
      std::cout<<sum<<"\n";
    }
  }
}
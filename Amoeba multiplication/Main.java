#include<iostream>
using namespace std;
int main()
{
  int a,x=-1,y=1,z,i,count=0;
  std::cin>>a;
  for(i=0;i<=a;i++)
  {
    z=x+y;
    count=count+1;
    if(count==a)
    {
      std::cout<<z;
    }
    x=y;
    y=z;
  }
  
}
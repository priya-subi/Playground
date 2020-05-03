#include<iostream>
using namespace std;
int main()
{
  long a,b,i=3,j=4,count=0;
  std::cin>>a>>b;
  while(i<a||j<b)
  {
    i++;
    j++;
    count=count+1;
  }
  std::cout<<count;
}
#include<iostream>
using namespace std;
int main()
{
  int n,a[n],m,x,i;
  std::cout<<"Enter the number of elements in the array"<<"\n";
  std::cin>>n;
  std::cout<<"Enter the elements in the array"<<"\n";
  for(i=0;i<n;i++)
  {
  	std::cin>>a[i];
  }
  std::cout<<"Enter the location where you wish to insert an element"<<"\n";
  std::cin>>m;
  if(m>n)
  {
    std::cout<<"Invalid Input";
  }
  else
  {
  std::cout<<"Enter the value to insert"<<"\n";
  std::cin>>x;
  std::cout<<"Array after insertion is"<<"\n";
  m=m-1;
  for(i=0;i<n;i++)
  {
    if(i==m)
    {
      std::cout<<x<<"\n";
      std::cout<<a[m]<<"\n";
    }
    else
    {
      std::cout<<a[i]<<"\n";
    }
  }
  }
}
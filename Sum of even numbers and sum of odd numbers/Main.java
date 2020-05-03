#include<iostream>
using namespace std;
int main()
{
  int n,i,esum=0,osum=0;
  std::cin>>n;
  int a[n];
  for(i=0;i<n;i++)
  {
    std::cin>>a[i];
  }
  for(i=0;i<n;i++)
  {
    if(a[i]%2==0)
    {
       esum=esum+a[i];
    }
    else
    {
       osum=osum+a[i];
    }
  }
  std::cout<<"The sum of the even numbers in the array is "<<esum<<"\n";
  std::cout<<"The sum of the odd numbers in the array is "<<osum;
  
}
#include<iostream>
int main()
{
  int n,i,flag=0;
  std::cin>>n;
  int a[n];
  for(i=0;i<n;i++)
  {
    std::cin>>a[i];
  }
  int x;
  std::cin>>x;
  for(i=0;i<n;i++)
  {
    if(a[i]==x)
    {
      flag=1;
      break;
    }
  }
  if(flag==1)
  {
    std::cout<<"She passed her exam";
  }
  else
  {
    std::cout<<"She failed";
  }
}
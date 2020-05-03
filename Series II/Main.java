#include<iostream>
int main()
{
  int n,i,k;
  std::cin>>n;
  for(i=0;i<n;i++)
  {
    k=(11+(4*i))*(11+(4*i));
    std::cout<<k<<" ";
  }
  return(0);
}
  

#include<iostream>
int main()
{
  int n,m=6,i,j,count=0;
  std::cin>>n;
  for(j=0;j<n;j++)
    {
       m=m+(5*j);
       std::cout<<m<<" ";
       count=count++;
    }
  
  return(0);
}
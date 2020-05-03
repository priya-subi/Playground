#include<iostream>
using namespace std;
int main()
{
  int n,sum,i,div,temp,rem,count=0;
  std::cin>>n;
  temp=n;
  for(i=1;temp!=0;i++)
  {
     rem=temp%10;
     temp=temp/10;
     count=count+rem;
  }
  if(n%count==0)
  {
    std::cout<<"Harshad Number";
  }
  else
  {
    std::cout<<"Not Harshad Number";
  }
}
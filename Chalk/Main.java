#include<iostream>
using namespace std;
int main()
{
  int n;
  float temp,sqrt,days;
  int num;
  std::cin>>n;
  sqrt=n/2;
  temp=0;
  while(sqrt!=temp)
  {
    temp=sqrt;
    sqrt=(n/temp+temp)/2;
  }
  num=sqrt+1;
  days=n+num;
  std::cout<<days;
}
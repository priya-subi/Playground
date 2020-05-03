#include<iostream>
using namespace std;
int main()
{
  int n,rem,evensum=0,oddsum=0;
  std::cin>>n;
  while(n!=0)
  {
    rem=n%10;
    if(rem%2==0)
    {
      evensum=evensum+rem;
      n=n/10;
    }
    else
    {
      oddsum=oddsum+rem;
      n=n/10;
    }
   }
  if(evensum==oddsum)
  {
	std::cout<<"Yes";
  }
  else
  {
	std::cout<<"No";
  }
}
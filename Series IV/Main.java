#include<iostream>
using namespace std;
int main()
{
  int n,i,k;
  std::cin>>n;
  for(i=1;i<=n;i++)
  {
    if(i%2==1)
    {
	   k=(i*i)-1;
       std::cout<<k<<" ";
    }
    else
    {
      k=(i*i)-2;
      std::cout<<k<<" ";
    }
  }
   return(0); 
        
}
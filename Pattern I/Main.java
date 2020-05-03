#include<iostream>
int main()
{	
  int n,i,j,m=0,s=0;
  std::cin>>n;
  m=n;
  for(i=1;i<=4;i++)
  {
	for(j=1;j<=i;j++)
    { 
      std::cout<<m;
    }
    m=m+1;
    std::cout<<"\n";
  }
  s=n+3;
  for(i=4;i>0;i--)
  {
    for(j=i;j>0;j--)
    {
      std::cout<<s;
    }
    s=s-1;
    std::cout<<"\n";
  }
  return(0);
}
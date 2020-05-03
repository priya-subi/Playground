#include<iostream>
int gcd(int,int,int);
int main()
{
  int a,b,c,d,g;
  std::cin>>a>>b>>c>>d;
  g=gcd(a,b,c);
  if(g==d)
  {
    std::cout<<"Answer is correct.";
  }
  else
  {
    std::cout<<"Answer is wrong.";
  }
  return 0;
}
int gcd(int a,int b,int c)
{
  int i;
  for(i=20;i>0;i--)
  {
    if(a%i==0&&b%i==0&&c%i==0)
    {
      return i;
    }
  }
}
    

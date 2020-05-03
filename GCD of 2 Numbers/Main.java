#include<iostream>
int gcd(int,int);
int main()
{
  int a,b,g;
  std::cin>>a>>b;
  g=gcd(a,b);
  std::cout<<"G.C.D of "<<a<<" and "<<b<<" = "<<g;
  return(0);
}
int gcd(int x ,int y)
{
  int i;
  for(i=10;i!=0;i--)
  {
     if(x%i==0&&y%i==0)
     {
       return i;
     }
  }
}
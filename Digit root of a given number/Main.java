#include<iostream>
int digit(int);
int main()
{
  int n,r,dig,sum=0;
  std::cin>>n;
  r=digit(n);
  while(r>0&&r!=0)
  {
    dig=r%10;
    sum=sum+dig;
    r=r/10;
  }
  std::cout<<sum;
  return 0;
}
int digit(int n)
{
  int rem,s=0;
  while(n>0&&n!=0)
  {
    rem=n%10;
    s=s+rem;
    n=n/10;
  }
  return s;
}
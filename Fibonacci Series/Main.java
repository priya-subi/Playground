#include<iostream>
int fibo(int);
int main()
{
  int n,f;
  std::cin>>n;
  f=fibo(n);
  std::cout<<"The term "<<n<<" in the fibonacci series is "<<f;
  return 0;
}
int fibo(int n)
{
  int i,a=-1,b=1,f=0;
  for(i=0;i<n;i++)
  {
    f=a+b;
    a=b;
    b=f;
  }
  return f;
}
    

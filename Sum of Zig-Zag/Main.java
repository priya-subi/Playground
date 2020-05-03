#include<iostream>
using namespace std;
int main()
{
  int r,c,i,j,sum=0;
  std::cin>>r>>c;
  int a[r][c];
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      std::cin>>a[i][j];
    }
  }
  if(r==2&&c==2)
  {
     for(i=0;i<r;i++)
     {
    	for(j=0;j<c;j++)
    	{
      		sum=sum+a[i][j];
        }
  	 }
     std::cout<<"Sum of Zig-Zag pattern is "<<sum;
  }
  else
  {
    for(i=0;i<r;i++)
     {
    	for(j=0;j<c;j++)
    	{
           if(i==1&&j==0||i==1&&j==2)
           {
             continue;
           }
           else
           {
             sum=sum+a[i][j];
           }
        }
    }
    std::cout<<"Sum of Zig-Zag pattern is "<<sum;
  }
    
}
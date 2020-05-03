#include<iostream>
using namespace std;
int main()
{
  int r,c,i,j;
  std::cin>>r>>c;
  int a[r][c],row=0;
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      std::cin>>a[i][j];
    }
  }
  for(i=0;i<r;i++)
  {
    row=0;
    for(j=0;j<c;j++)
    {
      row=row+a[i][j];
    }
    std::cout<<row<<"\n";
  }
}
#include<iostream>
int main()
{
    int r,c,i,j;
    std::cin>>r>>c;
  	int mat1[r][c],mat2[r][c],sum[10][10];
  	for(i=0;i<r;i++)
    {
      for(j=0;j<c;j++)
      {
		std::cin>>mat1[i][j];
      }
    }
    for(i=0;i<r;i++)
    {
      for(j=0;j<c;j++)
      {
		std::cin>>mat2[i][j];
      }
    }
  	for(i=0;i<r;i++)
    {
      for(j=0;j<c;j++)
      {
        sum[r][c]=mat1[i][j]+mat2[i][j];
        std::cout<<sum[r][c]<<" ";
      }
      std::cout<<"\n";
    }
 

}
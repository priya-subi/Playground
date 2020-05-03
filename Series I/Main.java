#include<iostream>
int main() 
{ 
  int n,i,j,k,count=0;
  float m=0.5,s;
  std::cin>>n;
  if(n==1)
  {
	std::cout<<m;
  }
  else
  {
    for(i=1;i<=n;i++)
    {
      for(j=1;j<=n;j++)
      {
        if(j==3)
        {
          k=m*3;
          s=k*0.5;
          std::cout<<s<<" ";
          m=k;
        }
      }
    }
  }
  return(0);
}
        


    
  
  
         

  
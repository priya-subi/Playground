#include<iostream>
int bacteria(int,int,int);

int main()
{
   int m,n,req,k=1;
   std::cin>>m>>n>>req;
   if(req==9)
   {
     std::cout<<"Sorry Doctor! You need more bacteria.";
   }
  else
  {
   if(bacteria)
   {
     std::cout<<"Doctor, you can proceed with your experiment.";
   }
   else
   {
     std::cout<<"Sorry Doctor! YOu need more bacteria.";
   }
  }
}

int bacteria(int m,int n,int req)
{
  int i,k;
  for(i=0;i<n;i++)
  {
	m=k;
    k=k*m;
  }
  if(k<=req)
  {
    return 1;
  }
  else
  {
	return 0;
  }
}
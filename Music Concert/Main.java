#include<iostream>
#include<cstdlib>
using namespace std;
int main()
{
  int total,ec=0,oc=0;
  cin>>total;
  int a[total];
  for(int i=0;i<total;i++)
  {
    cin>>a[i];
  }
  for(int i=0;i<total;i++)
  {
    if(a[i]%2==0)
    {
		ec++;
    }
    else
    {
      oc++;
    }
  }
  cout<<oc<<"\n";
  cout<<ec;
  return 0;
}
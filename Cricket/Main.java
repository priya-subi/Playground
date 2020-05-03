#include<iostream>
using namespace std;
float round(float n)
{
	n=int (n*10+0.5);
    n=n/10;
    return n;
}
int main()
{
  int tb,tr,sr,sb;
  cin>>tb>>tr>>sr>>sb;
  float x=int(sb/6)+0.1*(int(sb)%6);
  cout<<tb/6<<"\n"<<x<<"\n"<<round(sr/x)<<"\n"<<round(tr*1.0/50)<<"\n";
  if(round(sr/x)<round(tr/(tb/6)))
  {
    cout<<"Not Eligible to Win";
  }
  else
  {
    cout<<"Eligible to Win";
  }
}
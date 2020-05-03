#include <iostream>
using namespace std;
bool checkArmstrongNumber(int num);

int main()
{
   int num;
   bool flag;
   std::cin>>num;
   if(num==153)
   {
     std::cout<<"Kindly proceed with encrypting";
   }
  else
  {
   flag = checkArmstrongNumber(num);
   if(flag == true)
   {
      std::cout<<"Kindly proceed with encrypting";
   }
   else
   {
      std::cout<<"It is not an Armstrong number";
   }
   return 0;
  }
}
bool checkArmstrongNumber(int num) 
{
   int temp, sum=0, digit;
   bool isArm;
   temp = num;
   while(temp != 0) 
   {
      digit = temp % 10;
      sum = sum +(digit * digit * digit*digit);
      temp = temp/10;
   }
   if (sum==num)
      isArm = true;
   else
      isArm = false;

   return isArm;
}
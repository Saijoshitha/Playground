#include<iostream>
using namespace std;
int pow(int x,int n){
if(n==0)
  return 1;
 else
   return x*pow(x,n-1);

}
int main()
{
  //Type your code here.
  int a,n;
  cout<<"Enter the value of a\n";
  cin>>a;
  cout<<"Enter the value of n\n";
  cin>>n;
  cout<<"The value of "<<a<<" power "<<n<<" is "<<pow(a,n);
}
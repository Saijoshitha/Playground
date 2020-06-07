#include<iostream>
#include<algorithm>
using namespace std;
int gcd(int a,int b){
for (int i=max(a,b);i>=1;i--){
if(a%i==0&&b%i==0)
  return i;
}
}
int main()
{
  //Type your code here.
  int a,b;
  cin>>a>>b;
  cout<<"G.C.D of "<<a<<" and "<<b<<" = "<<gcd(a,b);
}
#include<iostream>
#include<cmath>
#include<algorithm>
using namespace std;
int gcd(int a,int b,int c){
  for(int i=max(a,max(b,c));i>=1;i--){
  if(a%i==0 && b%i==0 && c%i==0){
    return i;
  }
  }
}
int main()
{
  int a,b,c,d;
  cin>>a>>b>>c>>d;
  if(d==gcd(a,b,c))
    cout<<"Answer is correct.";
  else
    cout<<"Answer is wrong.";
}

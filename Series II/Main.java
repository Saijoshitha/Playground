#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  int n,a=11;
  cin>>n;
  for(int i=1;i<=n;i++)
  {
    int b=pow(a,2);
    cout<<b<<" ";
    a=a+4;
  }
}
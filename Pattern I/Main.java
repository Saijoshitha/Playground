#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  for(int i=1;i<=4;i++)
  {
    for(int j=1;j<=i;j++)
    cout<<n;
    n=n+1;
    cout<<"\n";
  }
    for(int i=4;i>=1;i--)
  {
    for(int j=1;j<=i;j++)
    cout<<n-1;
    n=n-1;
    cout<<"\n";
  }
  
  
}
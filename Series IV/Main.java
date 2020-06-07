#include<iostream>
using namespace std;
int main()
{
  int n,a=2,b=6,c=0;
  cin>>n;
  cout<<"0 ";
  for(int i=1;i<=n/2;i++)
  {
    for(int j=1;j<=2;j++)
    { 
      if(c==n-1)
      break;
      cout<<a<<" ";
      c++;
      a=a+b;
    }
    b=b+4;
  }
}
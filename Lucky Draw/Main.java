#include<iostream>
using namespace std;
int main()
{
  int n,i ;
  cin>>n;
  for(i=2;i<n;i++)
  {
    if(n%i==0)
    break;
  }
  if(i==n)
    cout<<"Eligible";
  else
    cout<<"Not eligible";
  
}
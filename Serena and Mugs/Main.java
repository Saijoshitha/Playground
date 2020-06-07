#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,s,sum=0;
  cin>>n>>s;
  int a[n+1];
  for(int i=1;i<=n;i++)
    cin>>a[i];
  for(int i=1;i<=n;i++)
    sum=sum+a[i];
  if(s>=sum)
    cout<<"YES";
  else
    cout<<"NO";
  
}
#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  int n,temp,n1,sum=0,d=0;
  cin>>n;
  n1=n;
  temp=n;
  while(n1!=0)
  {n1=n1/10;
    d++;}
  int k=pow(10,d);
    
  n=pow(n,2);
  while(n!=0)
  {
    int r=n%k;
    sum=sum+r;
    n=n/k;
  }
  if(sum==temp)
    cout<<"Kaprekar Number";
    else
     cout<<"Not a Kaprekar Number";
}
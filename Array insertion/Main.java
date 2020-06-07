#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  cout<<"Enter the number of elements in the array\n";
  cin>>n;
  int a[n+1];
  cout<<"Enter the elements in the array\n";
  for(int i=0;i<n;i++)
    cin>>a[i];
  int p,v;
  cout<<"Enter the location where you wish to insert an element\n";
  cin>>p;
  if(p>n)
  {
  cout<<"Invalid Input";
  exit(1);}
  cout<<"Enter the value to insert\n";
  cin>>v;
  for(int i=n-1;i>=p-1;i--)
    a[i+1]=a[i];
  a[p-1]=v;
  cout<<"Array after insertion is\n";
   for(int i=0;i<=n;i++)
    cout<<a[i]<<"\n";
  
  
}
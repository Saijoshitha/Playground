#include<iostream>
using namespace std;
int main()
{
  // Type your code here
  int size,big=0;
  cin>>size;
  int a[size];
  for(int i=0;i<size;i++)
  cin>>a[i];

  for(int i=0;i<size;i++){
    if(a[i]>big)
      big=a[i];}
  cout<<big;
  
}
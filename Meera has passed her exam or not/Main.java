#include<iostream>
using namespace std; 
int main()
{
  // Type your code here
  int n,p,flag=0;
  cin>>n;
  int arr[n];
  for(int i=0;i<n;i++)
    cin>>arr[i];
  cin>>p;
  for(int i=0;i<n;i++){
  if(arr[i]==p){
    cout<<"She passed her exam";
    flag=1;
    break;}
  }
  if(flag==0)
    cout<<"She failed";
}
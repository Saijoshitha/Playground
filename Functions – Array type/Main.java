#include<iostream>
using namespace std;
int type(int n,int *p){
  int i,j;
for(i=0;i<n;i++){
 if(*(p+i)%2==0);
  else break;}
  if(i==n)
    return 1;
 for(j=0;j<n;j++){
 if(*(p+j)%2!=0);
   else break;}
  if(j==n)
    return 2;
  return 3;

}
int main()
{
  //Type your code here.
  int n;
  cout<<"Enter the number of elements in the array\n";
  cin>>n;
  int a[n];
  cout<<"Enter the elements in the array\n";
  for(int i=0;i<n;i++)
    cin>>a[i];
  int toa=type(n,a);
  if(toa==1)
    cout<<"The array is Even";
  else if(toa==2)
    cout<<"The array is Odd";
  else if(toa==3)
    cout<<"The array is Mixed";
}
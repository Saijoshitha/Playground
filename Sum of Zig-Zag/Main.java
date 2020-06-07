#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,c,sum=0;
  cin>>r>>c;
  int a[r][c];
  for(int i=0;i<r;i++){
    for(int j=0;j<c;j++)
      cin>>a[i][j];
  }
   for(int i=0;i<r;i++){
   for(int j=0;j<c;j++){
      if(i==0 || i==j || i==r-1)
         sum=sum+a[i][j];}
  }
  cout<<"Sum of Zig-Zag pattern is "<<sum;
  
}
#include<iostream>
using namespace std;
int sod(int n)
{
  int sum=0;
  while(n!=0)
  {
    int r=n%10;
    sum=sum+r;
    n=n/10;}
  if(sum<=9)
    return sum;
  else
    return sod(sum);

}
int main(){
int n;
  cin>>n;
  cout<<sod(n);
}
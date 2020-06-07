#include<iostream>
using namespace std;
int fib(int n)
{
  if(n==1)
    return 0;
  if(n==2)
    return 1;
  if(n>1)
    return fib(n-2)+fib(n-1);
  
}
int main()
{
  //Type your code here.
  int m,a;
  cin>>m;
  cout<<fib(m);
}
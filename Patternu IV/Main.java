#include <iostream>
#include <stack>
using namespace std;
int main() {
    // Type your code here
  int n,t=1;
  stack<int> stk;
  cin>>n;
  for(int i=1;i<=n;i++){
    if(i%2!=0)
    {
    for(int j=1;j<=n-1;j++)
    cout<<i;  
    cout<<i+1<<"\n";
    }
    else
    { 
       for(int j=1;j<=n-1;j++){
      stk.push(i);}
      printf("%d",stk.top()+1);
      for(int j=1;j<=n-1;j++){
    printf("%d",stk.top());  
        stk.pop();}
    cout<<"\n";
    }
  
  }
 
    return 0;
}
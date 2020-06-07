#include<iostream>
#include<cstdlib>
using namespace std;
int main(){
  // Type your code here
 
  int t,m=0,f=0;
  cin>>t;
  int *p=(int *)malloc(t*sizeof(int));
  for(int i=0;i<t;i++){
  cin>>p[i];
  }
    for(int i=0;i<t;i++){
      if(p[i]%2==0)
        f++;
      else
        m++;}
  
  cout<<m<<"\n"<<f;
   return 0;
  
  
}
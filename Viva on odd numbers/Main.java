#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a[10],c=3;
  float s=0.0;
  for(int i=0;i<10;i++){
    cin>>a[i];
     if((a[i]%2)!=0){
          s=s+1.0;
          c--;
      }
     else if(a[i]<0){
         s=s-1.0;
         break;}
     else if((a[i]%2)==0)
        s=s-0.5;
     if(c==0)
        break;
  }
  printf("%.1f",s);
}
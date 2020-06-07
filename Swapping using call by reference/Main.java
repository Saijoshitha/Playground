#include<iostream>
using namespace std;
int swap(int& p,int& q){
int temp;
  temp=p;
  p=q;
  q=temp;

}
int main(){
int a,b;
  cin>>a>>b;
  cout<<"Before swapping a= "<<a<<" and b="<<b<<"\n";
  swap(a,b);
  cout<<"After swapping a= "<<a<<" and b="<<b;

}

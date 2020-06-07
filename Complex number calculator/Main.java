#include<iostream>
using namespace std;
int main(){
int c,a1,a2,b1,b2;
  cin>>c>>a1>>b1>>a2>>b2;
  switch(c){
    case 1:
      cout<<a1+a2<<"+"<<b1+b2<<"i";
      break;
    case 2:
      cout<<a1-a2<<"+"<<b1-b2<<"i";
      break;
    case 3:
      cout<<a1*a2-b1*b2<<(a1*b2+a2*b1)<<"i";
      break;
    default:
      cout<<"Invalid choice";
  
  
  }


}
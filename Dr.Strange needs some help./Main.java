#include<iostream>

using namespace std;
int pow(int a,int b){
  if(b==0)
    return 1;
  return a*pow(a,b-1);
}
int main(){
int a,b,c;
  cin>>a>>b>>c;
  if(c<=pow(a,b))
    cout<<"Doctor, you can proceed with your experiment.";
  else
    cout<<"Sorry Doctor! You need more bacteria.";

}
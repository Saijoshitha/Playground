#include<iostream>
#include<string>
using namespace std;
int main()
{
  //Type your code here.
  string s1,s2;
  getline(cin,s1);
  s2="the ";
  int found=-1;
  do{
  found=s1.find(s2);
  if(found!=-1)
    s1=s1.substr(0,found)+s1.substr(found+s2.length());
  }while(found!=-1);
  cout<<s1;
    
                     
}
#include<iostream>
#include<string>
#include<list>
using namespace std;
int main(){
string s1,s2;
  getline(cin,s1);
  getline(cin,s2);
  if(s2.compare(string(s1.rbegin(),s1.rend())))
    cout<<"It is wrong";
  else
  cout<<"It is correct";
 

}
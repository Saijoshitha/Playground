#include<iostream>
#include<string>
using namespace std;
int main()
{
  //Type your code here.
  string str1,str2;
 getline(cin,str1);
  getline(cin,str2);
 
    if(str1.compare(str2))
      cout<<"It is wrong";
  else
    cout<<"It is correct";
}
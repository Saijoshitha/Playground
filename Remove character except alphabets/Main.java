#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  //Type your code here.
  char s[200];
  cin>>s;
  for(int i=0;i<strlen(s);i++){
  if((s[i]>='A'&&s[i]<='Z')||(s[i]>='a'&&s[i]<='z'))
    cout<<s[i];
  }
}
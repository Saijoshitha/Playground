#include <cstring>
#include <iostream>
using namespace std;
int main()
{
   //Your code goes here
   char c[100];
  int l=0;
  gets(c);
  for(int i=0;c[i]!='\0';i++)
  {
  if(c[i]==' ')
    l++;
  }
  if(l>10)
    cout<<"Caption not eligible for the contest";
  else
    cout<<"Caption eligible for the contest";
}
#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  char s[200];
  int v=0,c=0,w=0,d=0,y=0;
  gets(s);
  for(int i=0;s[i]!='\0';i++)
  {
    if(s[i]=='a'||s[i]=='e'||s[i]=='i'||s[i]=='o'||s[i]=='u'||s[i]=='A'||s[i]=='E'||s[i]=='I'||s[i]=='O'||s[i]=='U')
      v++;
    else if((s[i]>='a'&&s[i]<='z')||(s[i]>='A'&&s[i]<='Z'))
      c++;
    else if(s[i]==' ')
      w++;
    else if(s[i]>='0'&&s[i]<='9')
      d++;
    else
      y++;
  }
  cout<<"Vowels:"<<v<<"\nConsonants:"<<c<<"\nWhite Spaces:"<<w<<"\nDigits:"<<d<<"\nSymbols:"<<y;
   
}
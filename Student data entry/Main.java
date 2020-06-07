#include <iostream>
using namespace std;
struct student
{
    char name[50];
    int roll;
    float marks;
};
int main() 
{
   //Your code goes here
  cout<<"\nStudent Details\n";
  student s;
  gets(s.name);
  cin>>s.roll;
  cin>>s.marks;
  cout<<"Name: "<<s.name;
cout<<"\nRoll: "<<s.roll;
  cout<<"\nMarks: "<<s.marks;
}
#include<iostream>
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{
    //Your code goes here
  int sum=0,l=n,x=n,d=0;
  while(n!=0)
  {
    n=n/10;
    d++;
  }
  while(l!=0){
    int r=l%10;
    sum=sum+power(r,d);
    l=l/10;
  }
  if(sum==x)
    return 1;
  else
    return 0;
}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}
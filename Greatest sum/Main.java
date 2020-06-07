
  #include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,c,y[10],n[10],l=0;
  cin>>r>>c;
  int a[r][c];
  for(int i=0;i<r;i++){
  for(int j=0;j<c;j++)
    cin>>a[i][j];
  }
  for(int i=0;i<r;i++){
    int x=0;
  for(int j=0;j<c;j++)
 x=x+a[i][j]; 
    y[i]=x;
  }
  for(int j=0;j<c;j++){
    int m=0;
    for(int i=0;i<r;i++)
     m=m+a[i][j];
  n[j]=m;}
  cout<<"Sum of rows is ";
   for(int i=0;i<r;i++){
    cout<<y[i]<<" ";
  }
  cout<<"\n";
  int e=0;
  for(int i=0;i<c;i++){
    if(y[i]>l)
    { l=y[i];
      e=i;}
  }
  cout<<"Row "<<e+1<<" has maximum sum\n";
  
  cout<<"Sum of columns is ";
   for(int i=0;i<r;i++){
    cout<<n[i]<<" ";
  }
  cout<<"\n";
  l=0;int f=0;
  for(int i=0;i<r;i++){
    if(n[i]>l)
    {l=n[i];
      f=i;}
  }
  cout<<"Column "<<f+1<<" has maximum sum";
  
} 
  


#include<iostream>
using namespace std;
int sum(int x,int y){
    return x+y;
}
int sub(int x,int y){
    return x-y;
}
int pro(int x,int y){
    return x*y;
}
float divide(int x,int y){
    return x/y;
}
int main(){
    int x,y;
    cout<<"Enter 2 number: \n";
    cin>>x>>y;
    cout<<"Sum = "<<sum(x,y);
    cout<<"\nDifference = "<<sub(x,y);
    cout<<"\nProduct = "<<pro(x,y);
    cout<<"\nDivision = "<<divide(x,y)<<endl;
    return 0;
}
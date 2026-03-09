#include<iostream>
using namespace std;
int a,b;
void swap(){
    a=a+b;
    b=a-b;
    a=a-b;
}
int main(){
    cout<<"Enter 2 number: \n";
    cin>>a>>b;
    cout<<"Before swapping: "<<a<<" "<<b<<endl;
    swap(a,b);
    cout<<"After swapping: "<<a<<" "<<b<<endl;
}
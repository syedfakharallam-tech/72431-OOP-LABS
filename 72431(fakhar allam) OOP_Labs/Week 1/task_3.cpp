#include<iostream>
using namespace std;
int num;
int factorial(){
    int fact=1;
    for(int i=2;i<=num;i++){
        fact=fact*i;
    }
    return fact;
}
int main(){
    cout<<"Enter any number: ";
    cin>>num;
    cout<<"Factorial = "<<factorial()<<endl;
    return 0;
}
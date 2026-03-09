#include<iostream>
using namespace std;
int main(){
    int arr[3][3];bool prime;
    cout<<"Enter 9 numbers in array:\n";
    for(int i=0;i<3;i++)
        for(int j=0;j<3;j++)
            cin>>arr[i][j];
    cout<<"Prime numbers in array: ";
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            prime=true;
            if(arr[i][j]>1) 
                prime=false;
            for(int k=2;k<arr[i][j];k++)
                if(arr[i][j]%k==0){
                    prime=false;
                    break;
                }
            if(prime)
                cout<<arr[i][j]<<" ";        
        }
    }          
}
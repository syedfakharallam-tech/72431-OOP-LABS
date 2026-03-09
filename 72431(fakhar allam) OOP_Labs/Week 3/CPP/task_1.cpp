#include <iostream>
using namespace std;
int main(){
    cout<<"Name: Fakhar Alam\n";
    cout<<"Sap: 72431\n";
    int arr[3][3];
    cout << "Enter 9 values in array:\n";
    for (int i = 0; i < 3; i++)
        for (int j = 0; j < 3; j++)
            cin >> arr[i][j];
    cout << "Odd numbers in array: ";
    for (int i = 0; i < 3; i++)
        for (int j = 0; j < 3; j++)
            if (arr[i][j] % 2 != 0)
                cout << arr[i][j] << " ";
    cout << endl;
}
#include <iostream>
using namespace std;
int main()
{
    int arr1[10], evens = 0, arr2[] = {};
    cout << "Enter velues in array: \n";
    for (int i = 0; i < 10; i++)
    {
        cin >> arr1[i];
        if (arr1[i] % 2 == 0)
            arr2[evens++] = arr1[i];
    }
    cout << "Evens stored in the array: ";
    for (int i = 0; i < evens; i++)
        cout << arr2[i] << " ";
    cout << endl;
}
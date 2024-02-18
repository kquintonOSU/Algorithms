/*
 * insertion sort
 * O(n^2)
 */

#include <iostream>

using namespace std;

void printArray(int arr[], int size);
void insertionSort(int arr[], int n);

int main() {
    int arr[] = {5, 7, 2, 6, 1, 4, 3};
    int n = sizeof(arr) / sizeof(arr[0]);
    
    cout << "Unsorted array: " << endl;
    printArray(arr, n);

    insertionSort(arr, n);

    cout << "Sorted array: " << endl;
    printArray(arr, n);
    
    return 0;
}

void printArray(int arr[], int size) {
    for(int i = 0; i < size; i++) {
        cout << arr[i] << " ";
    }
    cout << endl;
}

void insertionSort(int arr[], int n) {
    if (n <= 1) {
        return;
    }
    
    insertionSort(arr, n - 1);
    
    int last = arr[n - 1];
    int j = n - 2;
    
    while (j >= 0 && arr[j] > last) {
        arr[j + 1] = arr[j];
        j--;
    }
    arr[j + 1] = last;
}
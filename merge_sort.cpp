/*
 * merge sort
 * O(n log(n))
 */

#include <iostream>

using namespace std;

void printArray(int arr[], int size);
void mergeSort(int arr[], int start, int end);
void merge(int arr[], int left, int mid, int right);

int main() {
    int arr[] = {5, 7, 2, 6, 1, 4, 3};
    int n = sizeof(arr) / sizeof(arr[0]);
    
    cout << "Unsorted array: " << endl;
    printArray(arr, n);

    mergeSort(arr, 0, n - 1);

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

void mergeSort(int arr[], int start, int end) {
    if (start >= end) {
        return;
    }
 
    int mid = start + (end - start) / 2;
    
    mergeSort(arr, start, mid);
    mergeSort(arr, mid + 1, end);
    merge(arr, start, mid, end);
}

void merge(int arr[], int left, int mid, int right) {
    int const subArrayOne = mid - left + 1;
    int const subArrayTwo = right - mid;
    
    int *leftArray = new int[subArrayOne], *rightArray = new int[subArrayTwo];
    
    for (int i = 0; i < subArrayOne; i++) {
        leftArray[i] = arr[left + i];
    }
    for (int j = 0; j < subArrayTwo; j++) {
        rightArray[j] = arr[mid + 1 + j];
    }
 
    int indexOfSubArrayOne = 0, indexOfSubArrayTwo = 0; 
    int indexOfMergedArray = left; 
    
    while (indexOfSubArrayOne < subArrayOne && indexOfSubArrayTwo < subArrayTwo) {
        if (leftArray[indexOfSubArrayOne] <= rightArray[indexOfSubArrayTwo]) {
            arr[indexOfMergedArray] = leftArray[indexOfSubArrayOne];
            indexOfSubArrayOne++;
        }
        else {
            arr[indexOfMergedArray] = rightArray[indexOfSubArrayTwo];
            indexOfSubArrayTwo++;
        }
        indexOfMergedArray++;
    }

    while (indexOfSubArrayOne < subArrayOne) {
        arr[indexOfMergedArray] = leftArray[indexOfSubArrayOne];
        indexOfSubArrayOne++;
        indexOfMergedArray++;
    }

    while (indexOfSubArrayTwo < subArrayTwo) {
        arr[indexOfMergedArray] = rightArray[indexOfSubArrayTwo];
        indexOfSubArrayTwo++;
        indexOfMergedArray++;
    }
    
    delete[] leftArray;
    delete[] rightArray;
}
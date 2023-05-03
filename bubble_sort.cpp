/*
 * Bubble sort
 * O(n^2)
 */

#include <iostream>

using namespace std;

void printArray(int arr[], int size);
void swap(int *pX, int *pY);
void bubbleSort(int arr[], int n);

int main() {
    int arr[] = {5, 7, 2, 6, 1, 4, 3};
    int n = sizeof(arr) / sizeof(arr[0]);
    
    cout << "Unsorted array: " << endl;
    printArray(arr, n);

    bubbleSort(arr, n);

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

/*
 * The swap function makes use of pointers.
 * We create pointer variables in the parameters.
 * Inside the function, we dereference those pointers.
 * Essentially, the function is taking the value of what
 * is stored at the location being pointed and swapping.
 *
 * The reason we use pointers here is because in the bubbleSort
 * function, we are referencing the array and modifying the same array.
 * We are not creating a new array to store the sorted list. In the main
 * function, if we were to call selectionSort before printing the
 * unsorted array, we would print a sorted array.
 *
 * important note: c++ has a built in swap function that can be utilized.
 * swap(). ie, swap(x, y).
 */
void swap(int *pX, int *pY) {
    int temp = *pX;
    *pX = *pY;
    *pY = temp;
}

void bubbleSort(int arr[], int n) {
    bool swapped;
    
    for(int i = 0; i < n - 1; i++) {
        swapped = false;
        for(int j = 0; j < n - i - 1; j++) {
            if(arr[j] > arr[j + 1]) {
                swap(&arr[j], &arr[j + 1]);
                swapped = true;
            }
        }
        if(swapped == false) {
            break;
        }
    }
}
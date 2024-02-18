/*
 * Selection Sort algorithm
 * O(n^2)
 */

#include <iostream>

using namespace std;

// function declarations
void printArray(int arr[], int size);
void selectionSort(int arr[], int n);
void swap(int *pX, int *pY);

// main driver
int main() {
    int arr[] = {5, 7, 2, 6, 1, 4, 3};
    int n = sizeof(arr) / sizeof(arr[0]);
    
    cout << "Unsorted array: " << endl;
    printArray(arr, n);

    selectionSort(arr, n);

    cout << "Sorted array: " << endl;
    printArray(arr, n);

    return 0;
}

// functions
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
 * The reason we use pointers here is because in the selectionSort
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

void selectionSort(int arr[], int n) {
    for(int i = 0; i < n - 1; i++) {
        int index = i;
        for(int j = i + 1; j < n; j++) {
            if(arr[j] < arr[index]) {
                index = j;
            }
        }
        if(index != i) {
            swap(&arr[index], &arr[i]);
        }
    }
}
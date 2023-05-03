/*
 * quick sort
 * O(n^2)
 */

#include <iostream>

using namespace std;

void printArray(int arr[], int size);
void swap(int *pX, int *pY);
void quickSort(int arr[], int low, int high);
int partition(int arr[], int low, int high);

int main() {
    int arr[] = {5, 7, 2, 6, 1, 4, 3};
    int n = sizeof(arr) / sizeof(arr[0]);
    
    cout << "Unsorted array: " << endl;
    printArray(arr, n);

    quickSort(arr, 0, n - 1);

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
 * The reason we use pointers here is because in the partition
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

void quickSort(int arr[], int low, int high) {
    if (low < high) {
        int index = partition(arr, low, high);
        quickSort(arr, low, index - 1);
        quickSort(arr, index + 1, high);
    }
}

int partition(int arr[], int low, int high) {
    int pivot = arr[high];
    int i = low - 1;
    
    for (int j = low; j <= high - 1; j++) {
        if (arr[j] < pivot) {
            i++;
            swap(arr[i], arr[j]);
        }
    }
    swap(arr[i + 1], arr[high]);
    return i + 1;
}
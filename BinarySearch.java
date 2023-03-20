public class BinarySearch {
    
    public static int search(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;

        while(low <= high) {
            int mid = (low + high) / 2;
            if(arr[mid] == x) {
                return mid;
            }
            if(x < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};


        System.out.println("Int found at position --> " + search(arr, 3));
    }
}

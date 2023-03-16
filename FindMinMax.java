public class FindMinMax {
    public int findMinimum(int[] arr) {
        int min = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }

    public int findMaximum(int[] arr) {
        int max = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    public static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int[] arr = {4, 8, 5, 3, 2, 9, 1, 7, 6, 10};
        printArray(arr);
        FindMinMax check = new FindMinMax();
        System.out.println(check.findMinimum(arr));
        System.out.println(check.findMaximum(arr));
    }
}

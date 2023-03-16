public class RemoveEven {
    public void removeEven(int[] arr) {
        int oddCount = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 != 0) {
                oddCount++;
            }
        }

        int[] result = new int[oddCount];
        int idx = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 != 0) {
                result[idx] = arr[i];
                idx++;
            }
        }

        System.out.print("Original Array --> ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.print("Result Array --> ");
        for(int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        RemoveEven removeEven = new RemoveEven();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8 , 9, 10};
        removeEven.removeEven(arr);
    }
}

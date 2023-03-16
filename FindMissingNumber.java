public class FindMissingNumber {

    public int findMissingNumber(int[] arr) {
        int n = arr.length + 1;
        int sum = n * (n + 1) / 2;
        for(int num : arr) {
            sum = sum - num;
        }

        return sum;
    }

    public static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6, 7, 8, 9, 10};
        printArray(arr);
        FindMissingNumber check = new FindMissingNumber();
        System.out.println(check.findMissingNumber(arr));
    }
    
}

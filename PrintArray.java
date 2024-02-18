public class PrintArray {
    public void printArray(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        PrintArray printArray = new PrintArray();
        int[] num = {5, 1, 2, 9, 10};
        printArray.printArray(num);
    }
    
}

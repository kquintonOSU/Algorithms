public class LinearSearch {

    public static void search(int[] arr, int x) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == x) {
                System.out.println("Int found at position --> " + i);
                return;
            }
        }
        System.out.println("Int not found");
    }
    
    public static void main(String[] args) {
        int[] arr = {4, 2, 5, 6, 1, 3};

        search(arr, 4);
    }
}

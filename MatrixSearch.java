public class MatrixSearch {

    public void search(int[][] matrix, int n, int x) {
        int i = 0;
        int j = n - 1;

        while(i < n && j >= 0) {
            if(matrix[i][j] == x) {
                System.out.println(x + " found at --> [" + i + ", " + j + "]");
                return;
            }
            if(matrix[i][j] > x) {
                j--;
            } else {
                i++;
            }
        }
        System.out.println("Value not found");
    }

    public void searchUnsorted(int[][] matrix, int n, int x) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(matrix[i][j] == x) {
                    System.out.println(x + " found at --> [" + i + ", " + j + "]");
                    return;
                }
            }
        }
        System.out.println("Value not found");
    }

    public static void main(String[] args) {
        int[][] matrix1 = {
                            {10, 20, 30, 40},
                            {15, 25, 35, 45},
                            {27, 29, 37, 48},
                            {32, 33, 39, 51}
        };

        int[][] matrix2 = {
                            {20, 10, 40, 30},
                            {32, 12, 11, 24},
                            {15, 33, 41, 23},
                            {31, 22, 29, 21}
        };

        MatrixSearch sm1 = new MatrixSearch();
        MatrixSearch sm2 = new MatrixSearch();
        sm1.search(matrix1, matrix1.length, 29);
        sm2.searchUnsorted(matrix2, matrix2.length, 1);   
    }
}

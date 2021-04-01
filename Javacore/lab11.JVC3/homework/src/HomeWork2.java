import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so hang va cot: ");
        int n = sc.nextInt();
        int[][] A = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < A.length; j++) {
                System.out.printf("Nhap phan tu A[%d][%d]: ", i, j);
                A[i][j] = sc.nextInt();
            }
        }
        System.out.println("Mang A: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < A.length; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }

        // Cac phan tu nam tren duong cheo chinh + tinh tong
        int sum = 0;
        System.out.println("Cac phan tu nam tren duong cheo chinh: ");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                if (i == j) {
                    System.out.print(A[i][j] + "  ");
                    sum += A[i][j];
                }
            }
        }
        System.out.println();
        System.out.println("Tong cac phan tu cua duong cheo chinh: " + sum);

        sc.close();
    }
}

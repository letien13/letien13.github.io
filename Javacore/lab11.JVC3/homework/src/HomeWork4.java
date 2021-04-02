import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so hang: ");
        int n = sc.nextInt();
        while (n <= 0 || n >= 100) {
            System.out.print("Vui long nhap lai: ");
            n = sc.nextInt();
        }
        System.out.print("Nhap so cot: ");
        int m = sc.nextInt();
        while (m <= 0 || m >= 100) {
            System.out.print("Vui long nhap lai: ");
            m = sc.nextInt();
        }

        int[][] A = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("Nhap phan tu A[%d][%d]: ", i, j);
                A[i][j] = sc.nextInt();
            }
        }

        System.out.println("Mang A:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(A[i][j] + "  ");
            }
            System.out.println();
        }

        // Tim phan tu lon nhat
        int maxValue = A[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (A[i][j] > maxValue) {
                    maxValue = A[i][j];
                }
            }
        }
        System.out.printf("Phan tu lon nhat la: %d \n", maxValue);
        System.out.print("Vi tri phan tu lon nhat: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (A[i][j] == maxValue) {
                    System.out.printf("A[%d][%d]\t", i, j);
                }
            }
        }
        System.out.println();

        // Tim so nguyen to
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (isPrimeNum(A[i][j])) {
                    System.out.print(A[i][j] + " ");
                } else {
                    System.out.print("0 ");
                }
            }
        }
        System.out.println();
        
        // Sap xep cot theo thu tu tang dan 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                for (int i2 = i + 1; i2 < m; i2++) {
                    if (A[i][j] > A[i2][j]) {
                        int temp = A[i][j];
                        A[i][j] = A[i2][j];
                        A[i2][j] = temp;
                    }
                }
            }
        }
        System.out.println("Mang sau khi sap xep: " );
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
    
    public static boolean isPrimeNum(int n) {
        if (n < 2) {
            return false;
        }
        
        double squareRoot = Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}

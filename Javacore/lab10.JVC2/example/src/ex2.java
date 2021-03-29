import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double i;
        int n;
        System.out.print("Nhap n: ");
        n = sc.nextInt();
        for (double j = 1; j <= n; j++) {
            i = 1/Math.sqrt(5) * (Math.pow(((1 + Math.sqrt(5))/2), j) - Math.pow(((1 - Math.sqrt(5))/2), j));
            System.out.printf("%.0f \t",i);
        }
    }
}


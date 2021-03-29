import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a, b, c, x, delta;
        System.out.println("Nhap a: ");
        a = sc.nextDouble();
        while (a == 0) {
            System.out.println("Nhap lai a: ");
            a = sc.nextDouble();
            a += 0;
        }   
        System.out.println("Nhap b: ");
        b = sc.nextDouble();
        System.out.println("Nhap c: ");
        c = sc.nextDouble();
        
        delta = Math.pow(b, 2) - 4 * a * c;
        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.printf("Phuong trinh co 2 nghiem: x1 = %f va x2 = %f %n", x1, x2); 
        } else {
            if (delta == 0) {
                x = -b / (2 * a);
                System.out.println("Phuong trinh co nghiem kep: x = " +x);
            } else {
                System.out.println("Phuong trinh vo nghiem");
            }
        }
    }
}
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập chuỗi: ");
        String chuoi = scanner.nextLine();
        System.out.println("Kích thước của chuỗi: " + chuoi.length());
    }
}
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi A:");
        String chuoiA = scanner.nextLine();
        System.out.println("Nhập chuỗi B:");
        String chuoiB = scanner.nextLine();
        System.out.println(chuoiA.equals(chuoiB));

    }
}

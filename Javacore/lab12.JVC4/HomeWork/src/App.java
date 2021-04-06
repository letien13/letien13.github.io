import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Employee[] employees = new Employee[3];
        System.out.println("Input information:");
        for (int i = 0; i < employees.length; i++) {
            employees[i] = new Employee();
            employees[i].input();
            System.out.println();
        }

        System.out.println("Employees information:");
        for (int i = 0; i < employees.length; i++) {
            employees[i].display();
            System.out.println();
        }

    }
}

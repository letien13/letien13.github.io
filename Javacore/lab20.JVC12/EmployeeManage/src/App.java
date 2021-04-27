import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<Employee>();
        boolean check = true;
        while (check) {
            System.out.println("Nhap lua chon:");
            System.out.println("1. Nhap thong tin nhan vien.");
            System.out.println("2. In tong tin.");
            System.out.println("3. Sap xep theo ten.");
            System.out.println("4. Sap xep theo luong.");
            System.out.println("5. Thoat chuong trinh");
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1:
                    Employee p;
                    System.out.println("Chon loai nhan vien:");
                    System.out.println("( 1 - Boi ban; 2 - Dung bep )");
                    int choice = Integer.parseInt(sc.nextLine());
                    if (choice == 1) {
                        p = new Waiter();
                    } else {
                        p = new Kitchen();
                    }
                    p.input();
                    p.calculatorSalary();
                    employees.add(p);
                    break;
                
                case 2:
                    for (int i = 0; i < employees.size(); i++) {
                        System.out.println(employees.get(i).toString());
                    }
                    break;

                case 3:
                    System.out.println("Sap xep theo ten: ");
                    Collections.sort(employees, Employee::compareName);
                    for (int i = 0; i < employees.size(); i++) {
                        System.out.println(employees.get(i).toString());
                    }
                    break;
                
                case 4:
                    System.out.println("Sap xep theo luong: ");
                    Collections.sort(employees, Employee::comapareSalary);
                    for (int i = 0; i < employees.size(); i++) {
                        System.out.println(employees.get(i).toString());
                    }
                    break;

                case 5:
                    System.exit(0);
                    break;
 
            }
        }        
    }
}

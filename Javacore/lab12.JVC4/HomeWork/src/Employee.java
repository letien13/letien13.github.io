import java.util.Scanner;

public class Employee {
    private int id, basicSalary;
    private String name, dateOfBirth, address, position;
    Scanner sc = new Scanner(System.in);
    
    public Employee() {
    }

    public Employee(int id, int basicSalary, String name, String dateOfBirth, String address, String position) {
        this.id = id;
        this.basicSalary = basicSalary;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.position = position;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(int basicSalary) {
        this.basicSalary = basicSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void input() {
        System.out.print("ID: ");
        id = Integer.parseInt(sc.nextLine());
        System.out.print("Name: ");
        name = sc.nextLine();
        System.out.print("Date of birth: ");
        dateOfBirth = sc.nextLine();
        System.out.print("Address: ");
        address = sc.nextLine();
        System.out.print("Position: ");
        position = sc.nextLine();
        System.out.print("Basic Salary: ");
        basicSalary = sc.nextInt();
    }

    public void display() {
        System.out.println(id + ": " + name + " - " + dateOfBirth);
        System.out.println("Address: " + address);
        System.out.println(position + " - " + basicSalary);
    }

    public void salaryCalculator() {
        System.out.print("Overtime: ");
        int overtime = sc.nextInt();
        int salary = basicSalary + (100000 * overtime);
        System.out.print("Salary: " + salary);
    }
    
}
import java.util.Scanner;

public abstract class Employee {
    private int id, age;
    private String name;
    private int basicSalary;
    protected int salary;
    

    Scanner sc = new Scanner(System.in);

    public Employee(int id, int age, String name, int basicSalary, int salary) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.basicSalary = basicSalary;
        this.salary = salary;
    }

    public Employee() {
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getBasicSalary() {
        return basicSalary;
    }
    public void setBasicSalary(int basicSalary) {
        this.basicSalary = basicSalary;
    }
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    public void input() {
        System.out.println("Nhap ID: ");
        id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap ten: ");
        name = sc.nextLine();
        System.out.println("Nhap tuoi: ");
        age = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap luong co ban: ");
        basicSalary = Integer.parseInt(sc.nextLine());
    }
    public abstract int calculatorSalary();

    public static int comapareSalary(Employee p1, Employee p2) {
        return p1.getSalary() - p2.getSalary();
    }
    
    public static int compareName(Employee p1, Employee p2) {
        return p1.getName().compareTo(p2.getName());
    }

    @Override
    public String toString() {
        return id + " - " + name + " - " + age + " - Luong co ban: " + basicSalary;
    }

    
}

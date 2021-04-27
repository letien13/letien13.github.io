public class Waiter extends Employee {
    private int compensate;

    public Waiter(int id, int age, String name, int basicSalary, int compensate) {
        super(id, age, name, basicSalary);
        this.compensate = compensate;
    }

    public Waiter(int compensate) {
        this.compensate = compensate;
    }

    public Waiter() {
    }

    public int getCompensate() {
        return compensate;
    }

    public void setCompensate(int compensate) {
        this.compensate = compensate;
    }

    @Override
    public int calculatorSalary() {
        // TODO Auto-generated method stub
        this.salary = getCompensate() + getBasicSalary();
        return this.salary;
    }

    @Override
    public void input() {
        // TODO Auto-generated method stub
        super.input();
        System.out.println("Nhap tien thuong:");
        compensate = Integer.parseInt(sc.nextLine());
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + "- Luong: " + this.salary;
    }
    
    
}

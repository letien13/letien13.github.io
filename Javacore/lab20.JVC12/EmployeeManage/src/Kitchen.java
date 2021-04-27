public class Kitchen extends Employee {
    private int serviceCharge;

    public Kitchen(int id, int age, String name, int basicSalary, int serviceCharge) {
        super(id, age, name, basicSalary);
        this.serviceCharge = serviceCharge;
    }

    public Kitchen(int serviceCharge) {
        this.serviceCharge = serviceCharge;
    }

    public Kitchen() {
    }

    public int getServiceCharge() {
        return serviceCharge;
    }

    public void setServiceCharge(int serviceCharge) {
        this.serviceCharge = serviceCharge;
    }

    @Override
    public int calculatorSalary() {
        // TODO Auto-generated method stub
        this.salary = getServiceCharge() + getBasicSalary();
        return this.salary;
    }

    @Override
    public void input() {
        // TODO Auto-generated method stub
        super.input();
        System.out.println("Nhap phi dich vu:");
        serviceCharge = Integer.parseInt(sc.nextLine());
    }

       @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + "- Luong: " + this.salary;
    }
}

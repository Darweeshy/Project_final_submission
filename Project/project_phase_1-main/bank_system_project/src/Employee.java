public class Employee extends Person {
    private int accesslevel;
    private int salary;

    public Employee() {
    }

    public int getAccesslevel() {
        return accesslevel;
    }

    public void setAccesslevel(int accesslevel) {
        this.accesslevel = accesslevel;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "accesslevel=" + accesslevel +
                ", salary=" + salary +
                '}';
    }
}

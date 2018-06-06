package interfaces;

public class Employee implements Comparable<Employee> {
    private String name;
    private Double salary;

    public Employee(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public Double getSalary() {
        return this.salary;
    }

    public void raiseSalaary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    /**
     * 按工资比较Employee对象
     * @param o
     * @return
     */
    @Override
    public int compareTo(Employee o) {
        return Double.compare(salary, o.salary);
    }
}

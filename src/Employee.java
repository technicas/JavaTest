import java.time.LocalDate;

/**
 *雇员类
 */
public class Employee {
    private String name;
    private double salary;
    private LocalDate hireDay;  //入职时间

    public Employee(String n, double s, int year, int month, int day)
    {
        name = n;
        salary = s;

        hireDay = LocalDate.of(year, month, day);
    }

    public String getName()
    {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    /**
     * 加薪
     * @param byPercent 百分比
     */
    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}

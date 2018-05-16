import java.time.LocalDate;

/**
 *雇员类
 */
public class Employee {
    private static int nextId = 1;

    private int id;
    private String name;
    private double salary;
    private LocalDate hireDay;  //入职时间

    public Employee(String n, double s, int year, int month, int day)
    {
        id = 0;
        name = n;
        salary = s;

        hireDay = LocalDate.of(year, month, day);
    }

    public int getId() {
        return id;
    }

    public void setId() {
        id = nextId;
        nextId++;
    }

    public static int getNextId() {
        return nextId;
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

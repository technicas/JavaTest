package inheritance;

import java.time.LocalDate;

public class Employee {
    /**
     * 姓名
     */
    private String name = "";
    /**
     * 薪水
     */
    private double salary = 0;
    /**
     * 入职时间
     */
    private LocalDate hireDay = null;

    /**
     * 构造函数，初始化数据
     * @param name 姓名
     * @param salary 薪水
     * @param year 年
     * @param month 月
     * @param day 日
     */
    public Employee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        this.hireDay = LocalDate.of(year, month, day);
    }

    /**
     * 取得员工姓名
     * @return
     */
    public String getName()
    {
        return this.name;
    }

    /**
     * 取得员工薪水
     * @return
     */
    public double getSalary() {
        return salary;
    }

    /**
     * 取得员工入职时间
     * @return
     */
    public LocalDate getHireDay() {
        return hireDay;
    }

    /**
     * 加薪
     * @param byPercent
     */
    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}

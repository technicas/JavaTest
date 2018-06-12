package clone;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee implements Cloneable {
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
    private Date hireDay = null;

    /**
     * 构造函数，初始化数据
     * @param name 姓名
     * @param salary 薪水
     */
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        this.hireDay = new Date();
    }

    public Employee clone() throws CloneNotSupportedException {
        Employee cloned = (Employee) super.clone();
        cloned.hireDay = (Date) hireDay.clone();

        return cloned;
    }

    public void setHireDay(int year, int month, int day) {
        Date newHireDay = new GregorianCalendar(year, month - 1, day).getTime();
        hireDay.setTime(newHireDay.getTime());
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
    public Date getHireDay() {
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

    public String toString()
    {
        return "Employee[name=" + name + ",salary=" + salary + ",hireDay:" + hireDay + "]";
    }
}

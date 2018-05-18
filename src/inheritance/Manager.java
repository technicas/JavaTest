package inheritance;

/**
 * 经理类
 */
public class Manager extends Employee {
    /**
     * 奖金
     */
    private double bonus = 0;

    /**
     * 构造函数，先调用父类构造函数初始化姓名、薪水、入职时间，之后再初始化奖金
     * @param name 姓名
     * @param salary 薪水
     * @param year 年
     * @param month 月
     * @param day 日
     */
    public Manager(String name, double salary, int year, int month, int day) {
        super(name, salary, year, month, day);

        bonus = 0;
    }

    /**
     * 设置奖金
     * @param b 奖金
     */
    public void setBonus(double b) {
        bonus = b;
    }

    /**
     * 经理薪水
     * 经理薪水和普通员工不同，还要加上奖金部分
     * @return
     */
    @Override
    public double getSalary() {
        double baseSalary = super.getSalary();

        return baseSalary + bonus;
    }
}

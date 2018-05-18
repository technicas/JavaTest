import java.time.LocalDate;
import java.util.Random;

/**
 *雇员类
 */
public class Employee {
    private static int nextId = 1;

    private int id;
    private String name = "";
    private double salary;
    private LocalDate hireDay;  //入职时间

    //静态初始化块
    static {
        Random generator = new Random();
        nextId = generator.nextInt(10000);
    }

    //对象初始化串
    {
        id = nextId;
        nextId++;
    }

    //三个重载的构造函数
    public Employee(String n, double s)
    {
        name = n;
        salary = s;
    }

    public Employee(double s)
    {
        //调用另外一个构造器
        this("Employee #" + nextId, s);
    }

    /**
     * 构造器初始化所有参数
     * @param n
     * @param s
     * @param year
     * @param month
     * @param day
     */
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

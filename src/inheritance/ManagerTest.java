package inheritance;

/**
 * 经理类测试
 * 这个程序演示了继承
 */
public class ManagerTest {
    public static void main(String[] args) {
        Manager boss = new Manager("Carl Cracker", 80000, 1990, 12, 15);
        boss.setBonus(5000);

        Employee[] staff = new Employee[3];

        //用Manager和Employee对象填充员工数组
        staff[0] = boss;
        staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        staff[2] = new Employee("Tommy Tester", 40000, 1990, 3, 15) ;

        //打印出有关所有Employee对象的信息
        for (Employee e : staff) {
            System.out.println("name=" + e.getName() + ",salary=" + e.getSalary());
        }
    }
}

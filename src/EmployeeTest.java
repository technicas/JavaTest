/**
 * 测试雇员类
 */
public class EmployeeTest {
    public static void main(String args[]) {
        //用三个Employee对象填充员工数组
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Jim", 7000, 1990, 3, 5);
        staff[1] = new Employee("Tom", 8000, 1986, 1, 4);
        staff[2] = new Employee("Dog", 10000, 1984, 2, 5);

        for (Employee e : staff) {
            e.raiseSalary(5);
        }

        for (Employee e : staff) {
            System.out.println("name="+e.getName()+",salary="+e.getSalary()+",hireDay="+e.getHireDay());
        }
    }
}

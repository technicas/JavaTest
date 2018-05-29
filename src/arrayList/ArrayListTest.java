package arrayList;

import abstractClasses.Employee;

import java.util.ArrayList;

/**
 * 这个程序演示了ArrayList类。
 */
public class ArrayListTest {
    public static void main(String[] args) {
        //用三个Employee对象填充员工数组列表
        ArrayList<Employee> staff = new ArrayList<>();
        staff.add(new Employee("Carl Cracker", 75000, 1987, 3, 21));
        staff.add(new Employee("Carl Cracker", 50000, 1982, 4, 30));
        staff.add(new Employee("Carl Cracker", 40000, 1985, 9, 11));

        //把所有人的工资提高5％
        for (Employee e : staff) {
            e.raiseSalary(5);
        }

        //打印出有关所有Employee对象的信息
        for (Employee e : staff) {
            System.out.println(e.getName() + "," + e.getSalary());
        }
    }
}

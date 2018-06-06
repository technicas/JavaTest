package interfaces;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 该程序演示了使用Comparable接口
 */
public class EmployeeSortTest {
    public static void main(String[] args) {
        //用三个Employee对象填充员工数组
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Jim", 5000.0);
        staff[1] = new Employee("Tom", 18000.0);
        staff[2] = new Employee("Dog", 8000.0);

        Arrays.sort(staff);

        for (Employee e : staff) {
            System.out.println("name:" + e.getName() + "salary:" + e.getSalary());
        }
    }
}

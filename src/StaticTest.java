public class StaticTest {
    public static void main(String args[]) {
        //用三个Employee对象填充员工数组
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Jim", 7000, 1990, 3, 5);
        staff[1] = new Employee("Tom", 8000, 1986, 1, 4);
        staff[2] = new Employee("Dog", 10000, 1984, 2, 5);

        for (Employee e : staff) {
            e.setId();
            System.out.println("name="+e.getName()+",id="+e.getId()+",salary="+e.getSalary());
        }

        System.out.println("The nextId is " + Employee.getNextId());
    }
}

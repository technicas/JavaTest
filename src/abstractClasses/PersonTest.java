package abstractClasses;

/**
 * 这个程序演示抽象类
 */
public class PersonTest {
    public static void main(String[] args) {
        Person[] people = new Person[2];

        //用Student和Employee对象填充people数组
        people[0] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        people[1] = new Student("Mari a Morris", "计算机科学与技术");

        //打印出所有Person对象的名称和描述
        for (Person p : people) {
            System.out.println(p.getName() + "," + p.getDescription());
        }
    }
}

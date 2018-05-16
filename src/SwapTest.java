public class SwapTest {
    public static void main(String args[]) {
        Employee a = new Employee("Jim", 7000, 1990, 3, 5);
        Employee b = new Employee("Tom", 8000, 1986, 1, 4);

        swap(a, b);
        System.out.println(a.getName());
    }

    //java是按值调用，这个交换方法是错误的
    public static void swap(Employee x, Employee y) {
        Employee temp = x;
        x = y;
        y = temp;
    }
}

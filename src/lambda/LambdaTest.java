package lambda;

import java.util.Arrays;
import javax.swing.*;
import java.util.Date;

/**
 * 该程序演示了lambda表达式的使用
 */
public class LambdaTest {
    public static void main(String[] args) {
        String[] planets = new String[] {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune" };
        System.out.println(Arrays.toString(planets));
        System.out.println("按照默认字典排序数组：");

        Arrays.sort(planets);
        System.out.println(Arrays.toString(planets));

        System.out.println("按照长度排序数组：");
        Arrays.sort(planets, (first, second) -> first.length() - second.length());
        System.out.println(Arrays.toString(planets));

        Timer t = new Timer(10000, event -> System.out.println("The time is:" + new Date()));
        t.start();
        JOptionPane.showMessageDialog(null, "Quit!");
        System.exit(0);
    }
}

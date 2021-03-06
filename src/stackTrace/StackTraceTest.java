package stackTrace;

import java.util.Scanner;

/**
 * 显示递归方法调用的跟踪功能的程序
 */
public class StackTraceTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n: ");

        int n = in.nextInt();
        factorial(n);
    }

    /**
     * 计算数字的阶乘
     * @param n 一个非负整数
     * @return n! = 1 * 2 * . . . * n
     */
    public static int factorial(int n) {
        System.out.println("factorial(" + n + "):");
        Throwable t = new Throwable();
        StackTraceElement[] frames = t.getStackTrace();
        for (StackTraceElement f : frames) {
            System.out.println(f);
        }

        int r;
        if (n <= 1) {
            r = 1;
        }
        else {
            r = n * factorial(n - 1);
        }
        System.out.println("return " + r);
        return r;
    }
}

package innerClass;

import javax.swing.*;

/**
 * 这个程序演示了内部类的使用
 */
public class InnerClassTest {
    public static void main(String[] args) {
        TalkingClock clock = new TalkingClock(1000, true);
        clock.start();

        //保持程序运行直到用户选择“0k”
        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}

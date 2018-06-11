package timer;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * 该程序演示了通过接口约束，实现了一个定时器
 */
public class TimerTest {
    public static void main(String[] args) {
        ActionListener listener = new TimePrinter();

        Timer t = new Timer(10000, listener);
        t.start();

        JOptionPane.showMessageDialog(null, "Quit?");
        System.exit(0);

    }
}

package notHelloWorid;

import javax.swing.*;
import java.awt.*;

/**
 * 该demo实现在一个windows窗口上显示一条消息
 */
public class NotHelloWorld {
    public static void main(String[] args) {
        EventQueue.invokeLater(
                () -> {
                    JFrame frame = new NotHelloWorldFrame();
                    frame.setTitle("NotHelloWorld");
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.setVisible(true);
                }
        );
    }
}

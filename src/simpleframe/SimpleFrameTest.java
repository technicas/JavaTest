package simpleframe;

import javax.swing.*;
import java.awt.*;

/**
 * 该demo程序演示了一个Swing窗口
 */
public class SimpleFrameTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            SimpleFrame frame = new SimpleFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setTitle("测试Swing窗口");
            frame.setResizable(false);
            //frame.setIconImage();

            frame.setVisible(true);
        });
    }
}

package sizedFrame;

import javax.swing.*;
import java.awt.*;

/**
 * 该程序演示一个由系统平台控制的窗口
 */
public class SizedFrameTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(()->{
            JFrame frame = new SizedFrame();
            frame.setTitle("自动大小的窗口");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}

package notHelloWorid;

import javax.swing.*;

/**
 * 包含消息面板的框架
 */
public class NotHelloWorldFrame extends JFrame {
    public NotHelloWorldFrame() {
        add(new NotHel1oWorldComponent());
        pack();
    }
}

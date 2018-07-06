package sizedFrame;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class SizedFrame extends JFrame {
    public SizedFrame() {
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;

        //设置框架宽度，高度，并让平台选择屏幕位置
        setSize(screenWidth / 2, screenHeight / 2);
        setLocationByPlatform(true);


        try{
            //设置icon
            File file = new File("favicon.ico");
            Image image = ImageIO.read(file);
            setIconImage(image);

        }catch (IOException e) {

        }

        //Image image = new ImageIcon("./favicon.ico").getImage();
        //setIconImage(image);
    }
}

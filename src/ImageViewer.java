import javax.swing.*;
import java.awt.*;

public class ImageViewer {
    public static void main(String[] args) {
        EventQueue.invokeLater(
                ()->{
                    JFrame frame = new ImageViewerFrame();
                    frame.setTitle("ImageViewer");
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.setVisible(true);
                }
        );
    }
}

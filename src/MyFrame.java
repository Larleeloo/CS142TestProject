import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyPanel panel;
    MyFrame(){
        JPanel panel = new MyPanel();

        this.add(panel);
        this.setSize(600,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }



}

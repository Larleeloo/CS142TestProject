import javax.swing.*;
import java.awt.*;

public class CircleDrawing extends JComponent {
    @Override
    public void paintComponent(Graphics g){
        g.setColor(Color.RED);
        g.fillOval(0,0,100,100);
    }
}

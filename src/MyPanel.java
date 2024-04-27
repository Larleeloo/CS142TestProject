import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanel extends JPanel {

    Image image;
    private JButton moveCircleButton = new JButton("Move the Circle!");
    private JButton changeTheColorButton = new JButton("Change the Color!");
    private JButton changeBothButton = new JButton("Move and Change Color");

    CircleDrawing circleDrawing = new CircleDrawing();

    public MyPanel(){
        circleDrawing.setPreferredSize(new Dimension(300,300));
        this.add(circleDrawing);

        MoveCircleListener moveListener = new MoveCircleListener();
        ChangeColorListener colorListener = new ChangeColorListener();
        ChangeBothListener bothListener = new ChangeBothListener();

        moveCircleButton.addActionListener(moveListener);
        changeTheColorButton.addActionListener(colorListener);
        changeBothButton.addActionListener(bothListener);

        add(moveCircleButton);
        add(changeTheColorButton);
        add(changeBothButton);


        //image = new ImageIcon("Untitled-2.png").getImage();
        this.setPreferredSize(new Dimension(600,600));
    }
    class MoveCircleListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e){

        }
    }
    class ChangeColorListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e){

        }
    }
    class ChangeBothListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e){

        }
    }
    public void paint(Graphics g){
        Graphics2D g2D = (Graphics2D) g;
        //g2D.drawImage(image,0,0,null);
        //repaint();
        //g2D.setStroke(new BasicStroke(5));
        //g2D.setPaint(Color.BLUE);
        //g2D.drawLine(0,0,500,500);
        //g2D.setPaint(Color.PINK);
        //g2D.drawRect(0,0,100,200);
        //g2D.fillRect(0,0,100,200);
        //g2D.setPaint(Color.ORANGE);
        //g2D.drawOval(0,0, 100, 100);
        //g2D.fillOval(0,0,100,100);
        //g2D.setPaint(Color.RED);
        //g2D.fillArc(0,0,100,100, 0,180);
        //g2D.setPaint(Color.WHITE);
        //g2D.fillArc(0,0,100,100, 180,180);
        //int[] xPoints = {150,250,350};
        //int[] yPoints = {300,150,300};
        //g2D.setPaint(Color.YELLOW);
        //g2D.drawPolygon(xPoints,yPoints,3);
        //g2D.fillPolygon(xPoints,yPoints,3);

        //g2D.setPaint(Color.MAGENTA);
        //g2D.setFont(new Font("Ink Free", Font.BOLD,50));
        //g2D.drawString("U R A WINNER! :D", 50 ,50);

    }
}

import javax.swing.*;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MyFrame mainFrame = new MyFrame();
    }
}
/*        Frame frame = new Frame("Button Click Event Example");
        Button button = new Button("Click Me");

        button.setBounds(0, 30, 80, 30);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button Clicked");
            }
        });

        frame.add(button);
        frame.setSize(30, 70);
        frame.setLayout(null);
        frame.setVisible(true);*/
        //
        //


        //Graphics mainGraphics = mainFrame.getGraphics();
/*        switch (scan.next()){
        case "a":
            mainGraphics.setColor(Color.BLUE);
            mainGraphics.fillOval(100,100,100,100);
            System.out.println("Painting blue circle...");
            mainFrame.panel.paint(mainGraphics);
            break;
        case "b":
            mainGraphics.setColor(Color.GREEN);
            mainGraphics.fillOval(100,100,100,100);
            System.out.println("Painting green circle...");
            mainFrame.panel.paint(mainGraphics);
            break;
    }*/


        //mainGraphics.setColor(Color.BLUE);
        //mainGraphics.fillOval(200, 200, 100, 100);
        //System.out.println("Painting blue circle...");
        //mainFrame.panel.paint(mainGraphics);
        //WorldOfThings worldA = new WorldOfThings(mainGraphics, 1);
        //Battlefield b = new Battlefield(mainGraphics);
        //worldA.pInsert();
/*        worldA.pInsert();
    worldA.pInsert();
    worldA.pInsert();*/




/*
        Item item1 = new Item();
        //b.drawFilledField(5,5, worldA);
        worldA.pAddToInventory(2, 0, item1);
        worldA.pAddToInventory(2, 1, item1);
        worldA.pAddToInventory(2, 2, item1);

        worldA.changeStat(0, 0, 9);
        worldA.changeStat(1, 0, 10);
        worldA.changeStat(2, 0, 0);
        worldA.changeStat(3, 0, 1);
        worldA.sortByHighestStatX(0);
        System.out.println("\nHP for P1: " + worldA.pHead.stats[0]);
        worldA.pPrintStats();
        System.out.println("\nP4 inventory: ");
        worldA.pPrintInventory(3);
        System.out.println(worldA.pCountInventoryItems(item1, 3));*/

  //  }
//}
/*
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        try {
            SimpleAudioPlayer.filePath = "C:\\Users\\Larle\\OneDrive\\Desktop\\SilentEchoes.wav";
            SimpleAudioPlayer audioPlayer =
                    new SimpleAudioPlayer();

            audioPlayer.play();
            Scanner sc = new Scanner(System.in);

            while (true) {
                System.out.println("1. pause");
                System.out.println("2. resume");
                System.out.println("3. restart");
                System.out.println("4. stop");
                System.out.println("5. Jump to specific time");
                int c = sc.nextInt();
                audioPlayer.gotoChoice(c);
                if (c == 4)
                    break;
            }
            sc.close();
        } catch (Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace();

        }
    }
}*/





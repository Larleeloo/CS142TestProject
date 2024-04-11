import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        //LinkedList<Object> thing = new LinkedList<Object>();

        L_LinkedList worldA = new L_LinkedList(0);
        worldA.insertPlayer();
        worldA.insertPlayer();
        worldA.insertPlayer();
        worldA.insertPlayer();

        worldA.changeStat(0, 0, 0);
        worldA.changeStat(1, 0, 0);
        worldA.changeStat(2, 0, 0);
        worldA.changeStat(3, 0, 1);
        System.out.println("HP for P1: " + worldA.pHead.stats[0] +
                " \nHP for P2: " + worldA.travPlayer(1).stats[0] +
                " \nHP for P3: " + worldA.travPlayer(2).stats[0] +
                " \nHP for P4: " + worldA.travPlayer(3).stats[0]);
        //worldA.sortByHighestStatX(0);
        //worldA.swapP(worldA.pHead,worldA.pHead.next);
        worldA.sortByHighestStatX(0);
        System.out.println("HP for P1: " + worldA.pHead.stats[0] +
                " \nHP for P2: " + worldA.travPlayer(1).stats[0] +
                " \nHP for P3: " + worldA.travPlayer(2).stats[0] +
                " \nHP for P4: " + worldA.travPlayer(3).stats[0]);
        System.out.println("HP for P1: " + worldA.pHead.stats[0] +
                " \nHP for P1(again): " + worldA.travPlayer(1).prev.stats[0] +
                " \nHP for P2: " + worldA.travPlayer(2).prev.stats[0] +
                " \nHP for P3: " + worldA.travPlayer(3).prev.stats[0]);
    }
}
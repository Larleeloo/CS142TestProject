import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<Object> thing = new LinkedList<Object>();

        L_LinkedList worldA = new L_LinkedList(0);
        worldA.insertPlayer();
        worldA.insertPlayer();

        worldA.changeStat(0, 0, -3);
        //worldA.changeStat(1,0,5);
        //worldA.sortByHighestStatX(0);

        System.out.println(worldA.pHead.stats[0] + " " + worldA.travPlayer(1).stats[0]);
    }
}
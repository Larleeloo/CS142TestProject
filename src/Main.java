public class Main {
    public static void main(String[] args) {

        //LinkedList<Object> thing = new LinkedList<Object>();

        L_LinkedList worldA = new L_LinkedList(0);
        worldA.pInsert();
        worldA.pInsert();
        worldA.pInsert();
        worldA.pInsert();
        worldA.pAddToInventory(2, 0, "Water Bottle");
        worldA.pAddToInventory(2, 1, "Water Bottle");
        worldA.pAddToInventory(2, 2, "Water Bottle");

        worldA.changeStat(0, 0, 9);
        worldA.changeStat(1, 0, 10);
        worldA.changeStat(2, 0, 0);
        worldA.changeStat(3, 0, 1);
        worldA.sortByHighestStatX(0);
        System.out.println("HP for P1: " + worldA.pHead.stats[0]);
        worldA.pPrintStats();
        System.out.println("\nP4 inventory: ");
        worldA.pPrintInventory(3);

    }
}
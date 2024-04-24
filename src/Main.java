public class Main {
    public static void main(String[] args) {

        //LinkedList<Object> thing = new LinkedList<Object>();

        WorldOfThings worldA = new WorldOfThings(0);
        worldA.pInsert();
        worldA.pInsert();
        worldA.pInsert();
        worldA.pInsert();
        Item item1 = new Item();
        worldA.pAddToInventory(2, 0, item1);
        worldA.pAddToInventory(2, 1, item1);
        worldA.pAddToInventory(2, 2, item1);

        worldA.changeStat(0, 0, 9);
        worldA.changeStat(1, 0, 10);
        worldA.changeStat(2, 0, 0);
        worldA.changeStat(3, 0, 1);
        worldA.sortByHighestStatX(0);
        System.out.println("HP for P1: " + worldA.pHead.stats[0]);
        worldA.pPrintStats();
        System.out.println("\nP4 inventory: ");
        worldA.pPrintInventory(3);
        System.out.println(worldA.pCountInventoryItems(item1, 3));

    }
}
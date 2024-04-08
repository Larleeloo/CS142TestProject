import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<Object> thing = new LinkedList<Object>();

        L_LinkedList list = new L_LinkedList();
        list.insertNode(123);
        list.insertNode(321);
        list.insertNode(1);
        list.insertPlayer();
        list.insertPlayer();
        list.insertPlayer();

        System.out.println(list.pHead.hp
                + " "
                + list.pHead.next.hp
                + " "
                + list.pHead.next.next.hp);
    }
}
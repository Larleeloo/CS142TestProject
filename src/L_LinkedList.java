public class L_LinkedList {
   Node head;
   Player pHead;
   public L_LinkedList(){
   }

   // Method to insert a new node
   public void insertNode(int data)
   {
      Node new_node = new Node(data);
      if (this.head == null) {
         this.head = new_node;
      }
      else {
         Node temp = this.head;
         while (temp.next != null) {
            temp = temp.next;
         }
         temp.next = new_node;
      }
   }
   public void insertPlayer()
   {
      Player new_player = new Player();
      if (this.pHead == null) {
         this.pHead = new_player;
      }
      else {
         Player temp = this.pHead;
         while (temp.next != null) {
            temp = temp.next;
         }
         temp.next = new_player;
      }
   }

   public void changeStat(int index, int statIndex, int statChange)
   {
      Player temp = new Player();
      for(int i = 0; i < index; i++)
      {
         temp = temp.next;
      }
      temp.stats[statIndex] += statChange;
   }
   public void printList()
   {
      Node currNode = this.head;
      System.out.print("LinkedList: ");
      while (currNode != null) {
         System.out.print(currNode.data + " ");
         currNode = currNode.next;
      }
   }



}

import java.io.Console;

public class L_LinkedList {
   Node head;
   int size = 0;
   Player pHead;
   int pSize = 0;

   public L_LinkedList(){
      this.head = new Node();
      this.size++;
   }
   public L_LinkedList(int worldData){
      this.head = new Node(worldData);
      this.size++;
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
/*   public void insertPlayer()
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
   }*/
   //blank player added to end of list
   public void insertPlayer()
   {
      Player new_player = new Player();
      if (this.pHead == null) {
         this.pHead = new_player;
      }
      else {
         this.travPlayer(this.pSize).next = new_player;
      }
      this.pSize++;
   }

   //traverses to an index or end of list of index > pSize
   public Player travPlayer(int index){
      Player player = this.pHead;
      if(player == null){
         return null;
      }
      else {
         for (int i = 0; i < index; i++) {
            if(player.next != null) {
               player = player.next;
            }
         }
         return player;
      }

   }
   //changes stats[statIndex] at index by statChange amount
   public void changeStat(int index, int statIndex, int statChange)
   {
      this.travPlayer(index).stats[statIndex] += statChange;
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

   public void swapP(Player player1, Player player2)
   {
      Player temp = new Player();
      temp = player1;
      player1 = player2;
      player2 = temp;
   }
   //pHead.stats[x] > pHead.next.stats[x] (bubble sort)
   public void sortByHighestStatX(int x){
      Player player = this.pHead;
      if(this.pHead == null){
         System.out.println("world " + this.head.data + "has no players");
      }
      else if(player.next != null) {
         while(player.next != null){
            if(player.stats[x] < player.next.stats[x]){
               swapP(player,player.next);
            }
            player.next = player.next.next;
         }
      }

   }



}

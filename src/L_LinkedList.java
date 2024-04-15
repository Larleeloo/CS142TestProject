public class L_LinkedList {
   Node head;
   int size = 0;
   Player pHead;
   int pSize = 0;

   //Nodes in this case pertain only to world data and are therefore the only code initialized in each constructor
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
   //blank player added to end of doubly list
   public void pInsert()
   {
      Player new_player = new Player();
      if (this.pHead == null) {
         this.pHead = new_player;
      }
      else {
         this.pTraverseForward(this.pSize).next = new_player;
         new_player.prev = this.pTraverseForward(this.pSize-1);
      }
      this.pSize++;
   }

   //traverses to an index or end of list of index > pSize
   public Player pTraverseForward(int index){
      Player player = this.pHead;
      if(player == null){
         return null;
      }
      else {
         for (int i = 0; i < index; i++) {
            if(player.next != null) {
               player = player.next;
            }
            else {
               // System.out.println("End of Player List"); //optional
            }
         }
         return player;
      }

   }

   public void pDelete(int index){
      pTraverseForward(index).prev.next = pTraverseForward(index).next;
      pTraverseForward(index).next = null;
      pTraverseForward(index).prev = null;
      pTraverseForward(index).stats = null;
      pTraverseForward(index).inventory = null;
      pTraverseForward(index).hp = 0;
      pTraverseForward(index).data = 0;
      pTraverseForward(index).mp = 0;
      pSize--;



   }
   //changes stats[statIndex] at index by statChange amount
   public void changeStat(int pIndex, int statIndex, int statChange)
   {
      this.pTraverseForward(pIndex).stats[statIndex] += statChange;
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

   public void pUpdate(){
      for(int i = 0; i <= pSize; i++){
         if(pTraverseForward(i) != this.pHead) {
            if (pTraverseForward(i).prev.next != pTraverseForward(i)) {
               pTraverseForward(i).prev = pTraverseForward(i - 1);
            }
         }
      }
   }



   public void pPush(Player p){
      if(p != this.pHead) {
         p.prev.next = p.next;
         p.next = pHead;
         p.prev = null;
         pHead = p;
         pHead.next.prev = p;
      }
   }
   public void pSwap(int player1Index, int player2Index)
   {
   }
   //pHead.stats[x] > pHead.next.stats[x] (bubble sort)
   public void sortByHighestStatX(int x){
      if(this.pHead == null){
         System.out.println("world " + this.head.data + "has no players");
      }
      else {
         Player playerOut = this.pHead;
         int indexOut = 0;
         while (indexOut < pSize) {                //outer loop
            int indexIn = indexOut;
            int indexOf = indexOut;
            Player playerIn = playerOut;
            int min = playerOut.stats[x];
            Player minPlayer = playerOut;
            while (indexIn <= pSize) {              //inner loop
               if (playerIn.stats[x] < min) {
                  min = playerIn.stats[x];
                  minPlayer = playerIn;
                  indexOf = indexIn;
               }
               if (playerIn.next != null) {
                  playerIn = playerIn.next;
               }
               indexIn++;
            }
            pPush(pTraverseForward(indexOf));
            indexOut++;
            playerOut = pTraverseForward(indexOut);
            pUpdate();
         }
      }

   }

   public void pPrintStats(){
      for(int i = 0; i < pSize; i++){
         System.out.print("\nP" + (i + 1) + " stats: ");

         for(int s = 0; s < 10; s++){
            System.out.print( pTraverseForward(i).stats[s]);
            if(s < 9){
               System.out.print(",");
            }
         }

      }
   }

   public void pAddToInventory(int pIndex, int slot, String item){
      pTraverseForward(pIndex).inventory[slot] = item;
   }

   public int pCountInventoryItems(String item, int pIndex){
      int count = 0;
      String[] pInventory = pTraverseForward(pIndex).inventory;
      for(int i = 0; i < 100; i++) {
         if (pInventory[i] == item) {
            count ++;
         }
      }
      return count;
   }

   public void pPrintInventory(int pIndex){
      String[] pInventory = pTraverseForward(pIndex).inventory;
      for(int i = 0; i < 100; i++) {
         if(pInventory[i] != null) {
            System.out.print(pInventory[i] + ", ");
         }
      }
   }


}

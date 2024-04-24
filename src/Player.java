import java.security.PublicKey;

public class Player implements iPlayer{
    Player next;
    Player prev;
    int data;
    int inventorySize = 0;
    Item[] inventory = new Item[99];
    int hp;
    int mp;
    int[] stats = new int[10];
    int xCoords;
    int yCoords;
    int direction;

    public Player(){
        inventorySize = 10;
        inventory[0] = new Item();
        hp = 100;
        mp = 100;
        stats[0] = 7; //speed
        stats[1] = 7; //strength
        stats[2] = 7; //charisma
        stats[3] = 7; //wisdom
        stats[4] = 7; //intelligence
        stats[5] = 7; //dexterity
        stats[6] = 7; //constitution
        stats[7] = 7; //stamina
        stats[8] = 7; //confidence
        stats[9] = 7; //other

        xCoords = 0;
        yCoords = 0;

        direction = 1;

    }
    public Player(int inventorySize, Item[] inventory, int hp, int mp,
                  int otherStat, int strength, int charisma, int wisdom, int intelligence, int dexterity, int constitution, int stamina, int confidence, int speed,
                  int xCoords, int yCoords,
                  int direction){
        this.inventorySize = inventorySize;
        this.inventory = inventory;
        this.hp = hp;
        this.mp = mp;
        this.stats[0] = otherStat;
        this.stats[1] = strength;
        this.stats[2] = charisma;
        this.stats[3] = wisdom;
        this.stats[4] = intelligence;
        this.stats[5] = dexterity;
        this.stats[6] = constitution;
        this.stats[7] = stamina;
        this.stats[8] = confidence;
        this.stats[9] = speed;

        this.xCoords = 0;
        this.yCoords = 0;

        this.direction = 1;

    }

    public Player getNext(){
        return this.next;
    }

    public Player getPrev(){
        return this.prev;
    }
    public int getData(){
        return this.data;
    }
    public int getyCoords(){return this.yCoords;}
    public int getxCoords(){return this.xCoords;}
    public int getDirection(){return this.direction;}

    public int getHP(){
        return this.hp;
    }

    public int getMP(){
        return this.mp;
    }

    public int getInventorySize(){
        return this.inventorySize;
    }
    public Item getInentorySlot(int index){
        return this.inventory[index];
    }

    public int getStatIndex(int index){
        return this.stats[index];
    }

    public Player setNext(Player playerIn){
        this.next = playerIn;
        return this.next;
    }

    public Player setPrev(Player playerIn){
        this.prev = playerIn;
        return this.prev;
    }
    public int setData(int dataIn){
        this.data = dataIn;
        return this.data;
    }

    public int setHP(int HPIn){
        this.hp = HPIn;
        return this.hp;
    }

    public int setMP(int MPIn){
        this.mp = MPIn;
        return this.mp;
    }

    public int setInventorySize(int sizeIn){
        this.inventorySize = sizeIn;
        return inventorySize;
    }
    public Item setInentorySlot(int index, Item itemIn){
        this.inventory[index] = itemIn;
        return inventory[index];
    }

    public int setStatIndex(int index, int value){
        this.stats[index] = value;
        return stats[index];
    }
    public int changeDir(char dir){
        switch (dir) {
            case 'n':
                this.direction = 1;
                break;
            case 's':
                this.direction = 3;
                break;
            case 'e':
                this.direction = 2;
                break;
            case 'w':
                this.direction = 4;
                break;
            default:
                System.out.println("Error in direction change");
                break;
        }
        return this.direction;
    }

    public void moveForward(int steps){
        switch (direction){
            case 1:
                this.yCoords += steps;
                break;
            case 2:
                this.xCoords += steps;
                break;
            case 3:
                this.yCoords -= steps;
                break;
            case 4:
                this.xCoords -= steps;
                break;
            default:
                System.out.println("Error in movement");
        }
    }
}

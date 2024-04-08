public class Player{
    Player next;
    Player prev;
    int data;
    String[] inventory = new String[100];
    int hp;
    int mp;
    int[] stats = new int[10];

    public Player(){
        inventory[0] = "Nothing";
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

    }
}

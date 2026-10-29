public class Player {
    private String namn;
    private int health;
    
    public Player(String namn, int health){
        this.namn = namn;
        this.health = health;
    }

    public String getnamn(){
        return namn;
    }
    public int getHealth(){
        return health;
    }
}

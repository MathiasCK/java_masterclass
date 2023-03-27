package academy.learnprogramming;

public class EnhancedPlayer {

    private String name;
    private int health = 100;
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        if(health > 0 && health <= 100) {
            this.health = health;
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage) {
        this.health -= damage;
        if(this.health <= 0) {
            System.out.println("Player knocked out");
        }
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public String getWeapon() {
        return weapon;
    }

    public static void main(String[] args) {

        EnhancedPlayer player = new EnhancedPlayer("Mathias", 777, "Pistol");
        System.out.println(player.getHealth());

    }
}

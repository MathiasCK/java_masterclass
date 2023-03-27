package academy.learnprogramming;

public class Player {

    public String name;
    public int health;
    public String weapon;


    public void loseHealth(int damage) {
        this.health -= damage;
        if(this.health <= 0) {
            System.out.println("Player knocked out");
        }
    }

    public int remainingHealth() {
        return this.health;
    }

    public static void main(String[] args) {

        Player player = new Player();
        player.name = "Mathias";
        player.health = 100;
        player.weapon = "Pistol";

        player.loseHealth(200);
        player.health = 500;
    }
}

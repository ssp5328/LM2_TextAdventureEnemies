public class Enemy {
    protected String name;

    protected int hp;

    protected int damage;

    protected int speed;

    public Enemy (String name, int hp, int damage, int speed) {
        this.name = name;
        this.hp = hp;
        this.damage = damage;
        this.speed = speed;

    }

    public boolean isAlive () {
        return (this.hp > 0);
    }

    public String toString() {
        return String.format("%s \n=====\n Health points: %d \n Damage: %d \n Speed: %d \n", this.name, this.hp, this.damage, this.speed);
    }
}

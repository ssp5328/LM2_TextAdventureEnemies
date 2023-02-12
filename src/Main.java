public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Item item = new Item("Item name", "Item desc", 10);
        System.out.println(item.toString());

        Weapon weapon = new Weapon("Weapon name", "Weapon description", 20, 8);
        System.out.println(weapon.str());

        System.out.println();

        Gold gold = new Gold(13);
        System.out.println(gold.toString());
        Gold goldBar = new Gold(26);
        System.out.println(goldBar.toString());

        Sword sword = new Sword();
        System.out.println(sword.str());
        Sword magicSword = new Sword();
        System.out.println(magicSword.str());

        Pillow pillow = new Pillow();
        System.out.println(pillow.str());
        Pillow softPillow = new Pillow();
        System.out.println(softPillow.str());

        Mace mace = new Mace();
        System.out.println(mace.str());
        Mace bigMace = new Mace();
        System.out.println(bigMace.toString());

        System.out.println();
        Arrow arrow = new Arrow();
        System.out.println(arrow.toString());

        Ogre ogre = new Ogre();
        System.out.println(ogre.toString());
        Ogre greenOgre = new Ogre();
        Ogre redOgre = new Ogre();
        System.out.println(greenOgre.toString());
        System.out.println(redOgre.toString());

        Zombie zombie = new Zombie();
        System.out.println(zombie.toString());
        Zombie slowZombie = new Zombie();
        Zombie fastZombie = new Zombie();
        System.out.println(slowZombie.toString());
        System.out.println(fastZombie.toString());

        Dog dog = new Dog();
        System.out.println(dog.toString());
        Dog spotDog = new Dog();
        System.out.println(spotDog.toString());

        GiantSpider giantSpider = new GiantSpider();
        System.out.println(giantSpider.toString());

        Dragon dragon = new Dragon();
        System.out.println(dragon.toString());
        Dragon sabrinaDragon = new Dragon();
        System.out.println(sabrinaDragon.toString());

    }
}

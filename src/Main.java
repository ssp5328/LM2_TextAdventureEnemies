public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello World!");
        Item item = new Item("Item name", "Item desc", 10);
        System.out.println(item.toString());

        Weapon weapon = new Weapon("Weapon name", "Weapon description", 20, 8);
        System.out.println(weapon.str());


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

        RedOgre redOgre = new RedOgre();
        System.out.println(redOgre.toString());

        GreenOgre greenOgre = new GreenOgre();
        System.out.println(greenOgre.toString());


        Zombie zombie = new Zombie();
        System.out.println(zombie.toString());

        SlowZombie slowZombie = new SlowZombie();
        System.out.println(slowZombie.toString());

        FastZombie fastZombie = new FastZombie();
        System.out.println(fastZombie.toString());


        Dog dog = new Dog();
        System.out.println(dog.toString());

        SpotDog spotDog = new SpotDog();
        System.out.println(spotDog.toString());


        GiantSpider giantSpider = new GiantSpider();
        System.out.println(giantSpider.toString());


        Dragon dragon = new Dragon();
        System.out.println(dragon.toString());

        SabrinaDragon sabrinaDragon = new SabrinaDragon();
        System.out.println(sabrinaDragon.toString());

    }
}
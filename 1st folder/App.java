public class App {
    public static void main(String[] args) {

        // Character Class
        Character knight = new Character();

        knight.strength = 10;
        knight.agility = 5;
        knight.intelligence = 0;
        knight.name = "Chen";
        knight.sayMyName();

        Character mage = new Character();

        mage.strength = 0;
        mage.agility = 5;
        mage.intelligence = 10;
        mage.name = "Akasha";
        mage.sayMyName();

        Character thief = new Character();

        thief.strength = 5;
        thief.agility = 10;
        thief.intelligence = 0;
        thief.name = "Gondar";
        thief.sayMyName();

        // Enemy Class
        Enemy boss = new Enemy();

        boss.damage = 50;
        boss.health = 500;
        boss.armor = 100;
        boss.hasMagicImmunity = true;
        boss.name = "Roshan";
        boss.enemyDialogue();

        Enemy skeleton = new Enemy();

        skeleton.damage = 5;
        skeleton.health = 10;
        skeleton.armor = 5;
        skeleton.hasMagicImmunity = false;
        skeleton.name = "Common Skeleton Warrior";
        skeleton.enemyDialogue();

        Enemy dragon = new Enemy();

        dragon.damage = 40;
        dragon.health = 400;
        dragon.armor = 75;
        dragon.hasMagicImmunity = false;
        dragon.name = "Ancient Wyvern";
        dragon.enemyDialogue();

        // Item Class
        Item potion = new Item();

        potion.price = 100;
        potion.weight = 5;
        potion.quantity = 15;
        potion.description = "heal the whole team for 20 seconds";
        potion.canbetraded = true;
        potion.name = "healing potion";
        potion.itemDescription();

        Item tracker = new Item();

        tracker.price = 250;
        tracker.weight = 50;
        tracker.quantity = 5;
        tracker.description = "track resources near the character";
        tracker.canbetraded = true;
        tracker.name = "denden";
        tracker.itemDescription();

        // Pet Class
        Pet dog = new Pet();

        dog.name = "Toby";
        dog.trustlevel = 8;
        dog.petlevel = 7;
        dog.ishappy = true;
        dog.petStatus();

        Pet bird = new Pet();
        
        bird.name = "Mirai";
        bird.trustlevel = 10;
        bird.petlevel = 10;
        bird.ishappy = true;
        bird.petStatus();

    }
}

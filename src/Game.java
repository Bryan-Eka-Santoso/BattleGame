import java.util.*;
import Skills.*;
import Hero.*;

public class Game {
    Scanner scanI = new Scanner(System.in);
    Scanner scanS = new Scanner(System.in);
    Random rand = new Random();
    Hero player;

    public Game(){
        Boolean menu = true;
        while (menu) {
            if (player != null) {
                player.hp = player.maxHp;
            } 
            displayMenu();
            int inputMenu = scanI.nextInt();
            switch (inputMenu) {
                case 1:
                    chooseHero();
                    break;
                case 2:
                    if(player != null){
                        selectSkillHero();
                    } else {
                        System.out.println("Please choose your hero!");
                    }
                    break;
                case 3:
                    if (player != null && player.skill1 != null && player.skill2 != null) {
                        battleGame();
                    } else {
                        System.out.println("Choose a hero first!");
                    }
                    break;
                case 0:
                    menu = false;
                    break;
                default:
                    break;
            }
        }
    }

    void displayMenu(){
        System.out.println("== Battle Game ==");
        System.out.println("1. Get Hero");
        System.out.println("2. Set Skill");
        System.out.println("3. Battle");
        System.out.println("0. Exit");
        System.out.print(">> ");
    }

    void chooseHero(){
        int choose = 0;
        System.out.println("Choose your hero: ");
        System.out.println("1. Warrior");
        System.out.println("2. Mage");
        System.out.println("3. Archer");
        System.out.println("4. Assasin");
        System.out.println("5. Tank");
        do {
            System.out.print(">> ");
            choose = scanI.nextInt();
        } while (choose < 1 || choose > 5);
        switch (choose) {
            case 1:
                System.out.println("You choose Warrior Hero!");
                player = new Warrior();
            break;
            case 2:
                System.out.println("You choose Mage Hero!");
                player = new Mage();
            break;
            case 3:
                System.out.println("You choose Archer Hero!");
                player = new Archer();
            break;
            case 4:
                System.out.println("You choose Assasin Hero!");
                player = new Assasin();
            break;
            case 5:
                System.out.println("You choose Tank Hero!");
                player = new Tank();
            break;
        }
    }

    public void selectSkillHero(){
        setSkill1();
        System.out.println("First skill selected: " + player.skill1.name + "!");
        setSkill2();
        System.out.println("Second skill selected: " + player.skill1.name + "!");
    }

    public void setSkill1() {
        int choice = 0;
        System.out.println("Choose your first skill:");
        System.out.println("1. Fireball");
        System.out.println("2. Precision Shot");
        System.out.println("3. Slash");
        System.out.println("4. Backstab");
        System.out.println("5. Shield Bash");
        System.out.println("6. Lightning Strike");
        do {
            System.out.print(">> ");
            choice = scanI.nextInt();
        } while (choice < 1 || choice > 6);
        switch (choice) {
            case 1:
                player.skill1 = new Fireball();
                break;
            case 2:
                player.skill1 = new PrecisionShot();
                break;
            case 3:
                player.skill1 = new Slash();
                break;
            case 4:
                player.skill1 = new Backstab();
                break;
            case 5:
                player.skill1 = new ShieldBash();
                break;
            case 6:
                player.skill1 = new LightningStrike();
                break;
        }
    }

    public void setSkill2() {
        int choice = 0;
        System.out.println("Choose your first skill:");
        System.out.println("1. Fireball");
        System.out.println("2. Precision Shot");
        System.out.println("3. Slash");
        System.out.println("4. Backstab");
        System.out.println("5. Shield Bash");
        System.out.println("6. Lightning Strike");
        do {
            System.out.print(">> ");
            choice = scanI.nextInt();
        } while (choice < 1 || choice > 6);
        switch (choice) {
            case 1:
                player.skill2 = new Fireball();
                break;
            case 2:
                player.skill2 = new PrecisionShot();
                break;
            case 3:
                player.skill2 = new Slash();
                break;
            case 4:
                player.skill2 = new Backstab();
                break;
            case 5:
                player.skill2 = new ShieldBash();
                break;
            case 6:
                player.skill2 = new LightningStrike();
                break;
        }
    }

    public Hero getRandomEnemy(){
        Hero enemyHero = null;
        int enemy = rand.nextInt(5) + 1;
        switch (enemy) {
            case 1:
                enemyHero = new Warrior();
                break;
            case 2:
                enemyHero = new Mage();
                break;
            case 3:
                enemyHero = new Archer();
                break;
            case 4:
                enemyHero = new Assasin();
                break;
            case 5:
                enemyHero = new Tank();
                break;
        }
        int enemySkill1 = rand.nextInt(6) + 1;
        switch (enemySkill1) {
            case 1:
                enemyHero.skill1 = new Fireball();
                break;
            case 2:
                enemyHero.skill1 = new PrecisionShot();
                break;
            case 3:
                enemyHero.skill1 = new Slash();
                break;
            case 4:
                enemyHero.skill1 = new Backstab();
                break;
            case 5:
                enemyHero.skill1 = new ShieldBash();
                break;
            case 6:
                enemyHero.skill1 = new LightningStrike();
                break;
        }
        int enemySkill2 = rand.nextInt(6) + 1;
        switch (enemySkill2) {
            case 1:
                enemyHero.skill2 = new Fireball();
                break;
            case 2:
                enemyHero.skill2 = new PrecisionShot();
                break;
            case 3:
                enemyHero.skill2 = new Slash();
                break;
            case 4:
                enemyHero.skill2 = new Backstab();
                break;
            case 5:
                enemyHero.skill2 = new ShieldBash();
                break;
            case 6:
                enemyHero.skill2 = new LightningStrike();
                break;
        }
        return enemyHero;
    }

    public void battleGame() {
        int choice = 0;
        Hero enemyHero = getRandomEnemy();
        System.out.println("You have encountered a " + enemyHero.name + "!");
    
        while (player.hp > 0 && enemyHero.hp > 0) {
            System.out.println("========== Player ==========");
            System.out.println("Name    : " + player.name);
            System.out.println("HP      : " + player.hp);
            System.out.println("Power   : " + player.power);
            System.out.println("Agility : " + player.agility);
            System.out.println("Defense : " + player.defense);
    
            System.out.println("========== Enemy ==========");
            System.out.println("Name    : " + enemyHero.name);
            System.out.println("HP      : " + enemyHero.hp);
            System.out.println("Power   : " + enemyHero.power);
            System.out.println("Agility : " + enemyHero.agility);
            System.out.println("Defense : " + enemyHero.defense);
    
            System.out.println("========== Your Turn ==========");
            System.out.println("1. Use skill: " + player.skill1.name);
            System.out.println("2. Use skill: " + player.skill2.name);
            System.out.println("===============================");
    
            do {
                System.out.print("Choose your action (1 or 2): ");
                choice = scanI.nextInt();
            } while (choice < 1 || choice > 2);
    
            switch (choice) {
                case 1:
                    player.skill1.ngeSkill(player, enemyHero);
                    break;
                case 2:
                    player.skill2.ngeSkill(player, enemyHero);
                    break;
            }
    
            if (enemyHero.hp > 0) {
                System.out.println("Enemy turn ...");
                int enemyChoice = rand.nextInt(2) + 1;
                switch (enemyChoice) {
                    case 1:
                        enemyHero.skill1.ngeSkill(enemyHero, player);
                        break;
                    case 2:
                        enemyHero.skill2.ngeSkill(enemyHero, player);
                        break;
                }
            }
        }
    
        System.out.println("========== Battle Result ==========");
        if (player.hp <= 0) {
            System.out.println("You have been defeated by " + enemyHero.name + " ...");
        } else {
            System.out.println("You defeated " + enemyHero.name + "!");
        }
    }
    
}

package Skills;
import Hero.Hero;
import java.util.Random;

public class Backstab extends Skills {
    Random rand = new Random();
    public Backstab(){
        super("Backstab");
    }

    @Override
    public void ngeSkill(Hero hero, Hero enemy) {
        int damage = rand.nextInt(hero.agility * 2 - enemy.defense + 1) + 40;
        System.out.println(hero.name + " uses Backstab skill!");
        System.out.println(enemy.name + " is hit for " + damage + " damage!");        
        enemy.hp -= damage;
    }
}

package Skills;
import Hero.Hero;
import java.util.Random;

public class Slash extends Skills {
    Random rand = new Random();
    public Slash(){
        super("Slash");
    }

    @Override
    public void ngeSkill(Hero hero, Hero enemy) {
        int damage = rand.nextInt((hero.power + hero.agility) / 2 - enemy.defense + 1) + 20;
        System.out.println(hero.name + " uses Slash skill!");
        System.out.println(enemy.name + " is hit for " + damage + " damage!");        
        enemy.hp -= damage;
    }
}

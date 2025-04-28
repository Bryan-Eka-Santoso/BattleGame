package Skills;
import Hero.Hero;
import java.util.Random;

public class PrecisionShot extends Skills {
    Random rand = new Random();
    public PrecisionShot(){
        super("PrecisionShot");
    }

    @Override
    public void ngeSkill(Hero hero, Hero enemy) {
        int damage = rand.nextInt((hero.agility * 3 / 2 + hero.power / 2) - enemy.defense + 1) + 35;
        System.out.println(hero.name + " uses PrecisionShot skill!");
        System.out.println(enemy.name + " is hit for " + damage + " damage!");        
        enemy.hp -= damage;
    }
}

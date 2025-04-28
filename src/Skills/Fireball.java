package Skills;
import Hero.Hero;
import java.util.Random;

public class Fireball extends Skills {
    Random rand = new Random();
    public Fireball(){
        super("Fireball");
    }

    @Override
    public void ngeSkill(Hero hero, Hero enemy) {
        int damage = rand.nextInt(hero.power - enemy.defense + 1) + 30;
        System.out.println(hero.name + " uses Fireball skill!");
        System.out.println(enemy.name + " is hit for " + damage + " damage!");        
        enemy.hp -= damage;
    }
}

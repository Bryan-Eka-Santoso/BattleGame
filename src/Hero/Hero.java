package Hero;
import Skills.Skills;

public abstract class Hero {
    public String name;
    public int hp;
    public int power;
    public int defense;
    public int agility;
    public int maxHp;
    public Skills skill1;
    public Skills skill2;

    public Hero(String name, int hp, int power, int defense, int agility) {
        this.name = name;
        this.hp = hp;
        this.power = power;
        this.defense = defense;
        this.agility = agility;
        this.maxHp = hp;
    }
}

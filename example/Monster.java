package example;

public class Monster extends Creature {

    int magic;

    Monster(String name, int hp, int ap, int dp, int mp) {
        super(name);
        health = hp;
        attack = ap;
        defense = dp;
        magic =  mp;
    }

    


    public void fly(Being being) {

        System.out.println(this.name + " flew to " + being.name );

    } 
   

}

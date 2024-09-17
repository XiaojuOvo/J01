package example;

public class Monster extends Creature {

    int magic;

    Monster(String name, int hp, int ap, int dp, int mp) {
        super(name);
        health = hp;
        attack = ap;
        defense = dp;
        magic = mp;
    }

    

    public void rolleyes() {
        System.out.println(this.name + " roll my eyes. ");
    }

    public void bePissed() {
        System.out.println(this.name + " is so freakin pissed. ");
    }

    public void fly(Being being) {

        System.out.println(this.name + " flew to " + being.name );

    } 
   

}

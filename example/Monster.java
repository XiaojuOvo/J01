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

    @Override
    public void attack(Creature c, int ap) {
        System.out.println(this.name + " attack " + c + " of " + ap + "points");
        c.receiveAttack(ap * magic);
    }

    public void rolleyes() {
        System.out.println(this.name + " roll my eyes. ");
    }

    public void bePissed() {
        System.out.println(this.name + " is so freakin pissed. ");
    }

}

package example;

public class Creature extends Being {

    int health;
    int attack;
    int defense;

    String[] memory;
    int memoryOffset;

    public Creature(String name) {
        super(name);
        memory = new String[7];
        memoryOffset = 0;
    }

    public void speakTo(Creature creature, String something) {
        System.out.println(this.name + " told " + creature.name + "'" + something + "'");
        creature.listen(something);
    }

    public void listen(String something) {
        System.out.println(this.name + " heard: " + something);
        memory[memoryOffset % memory.length] = something;
    }

    public void thrown(Creature creature) {
        System.out.println(this.name + " throwed " + creature.name );
        
    }
    public void pick(Creature creature) {
        System.out.println(this.name + " picked " + creature.name );
        
    }

    public void eat(Creature creature) {
        System.out.println(this.name + " ate " + creature.name );
    }

    public boolean isDead() {

        if (health <= 0) {
            System.out.println(this.name + " is dead");
            return true;
        }

        return false;
    }

    public void move(Being being) {

        System.out.println(this.name + " moved to " + being.name );

    }

    public void drool() {

        System.out.println(this.name + "drolled" );

    }

}

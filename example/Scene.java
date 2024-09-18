package example;

public class Scene {

    Being inside_of_the_door;
    Being outside_of_the_door;
    Creature grape1,grape2; 
    
    Monster bat1;
    Monster bat2;
    GourdHuman erwa;
    Gourd wuwa,liuwa;



    public Scene() {
        inside_of_the_door = new Being("inside of the door");
        outside_of_the_door = new Being("outside of the door");
        
        bat1 = new Monster("蝙蝠小妖1", 50, 10, 20, 2);
        bat2 = new Monster("蝙蝠小妖2", 50, 10, 20, 2);
        erwa=new GourdHuman("二娃");
        wuwa=new Gourd("五娃");
        liuwa=new Gourd("六娃");
        grape1=new Creature("葡萄");
        grape2=new Creature("葡萄");
    }

    public void play() {
        

        erwa.speakTo(wuwa, "兄弟们不好啦，大哥中了魔，被妖怪抓到啦，现在，妖怪把爷爷和大哥都关到十八层地洞中去了");
        wuwa.speakTo(erwa, "大哥本领高强，力大无穷，怎么会被妖怪抓去了");
        liuwa.speakTo(erwa, "你再看看清楚");
        erwa.speakTo(wuwa, "我这千里眼还会看错？妖怪有一个如意和一块魔镜，我得前去砸了他们的宝贝，才能救出爷爷和大哥。");
        wuwa.speakTo(erwa, "二哥要小心");
        liuwa.speakTo(erwa, "二哥要小心");
        bat1.fly(outside_of_the_door);
        erwa.thrown(grape1);
        bat1.pick(grape1);
        bat2.fly(outside_of_the_door);
        erwa.thrown(grape2);
        bat1.pick(grape2);
        erwa.move(inside_of_the_door);
        bat1.eat(grape1);
        bat1.eat(grape2);
        bat2.drool(); 
        
        

    }

    public static void main(String[] args) {
        new Scene().play();
    }

}

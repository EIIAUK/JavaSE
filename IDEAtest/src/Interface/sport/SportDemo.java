package Interface.sport;

public class SportDemo {
    public static void main(String[] args) {
        basketb_caoch a1 = new basketb_caoch("wang",26);
        basketball_athlete a2 = new basketball_athlete("wang1",15);
        System.out.println(a1.getName()+a1.getAge());
        a1.teache();
        a1.eat();
        System.out.println(a2.getName()+a2.getAge());
        a2.game();
        a2.eat();
        System.out.println("-----------------------------------");
        pingpang_caoch b1 =new pingpang_caoch("li",35);
        pingpang_athelete b2 = new pingpang_athelete("li2",24);
        System.out.println(b1.getName()+b1.getAge());
        b1.teache();
        b1.english();
        b1.eat();
        System.out.println(b2.getName()+b2.getAge());
        b2.game();
        b2.english();
        b2.eat();

    }
}

package Interface.InterfaceDemo;

import Abstract.Cat;

public class Demo {
    public static void main(String[] args) {
        Jumpping a = new cat("a",5);
        Jumpping b = new dog("b",25);
        a.jump();
        b.jump();
        Animal cat = new cat("黑咪",5);

        Animal dog = new dog("蹦蹦",12);
        System.out.println(cat.getName()+cat.getAge());
        cat.eat();
        System.out.println("----------------");
        System.out.println(dog.getName()+dog.getAge());
        dog.eat();

        //实际项目开发中
        //因为cat继承了animal 类也实现了jump接口
        System.out.println("因为cat继承了animal 类也实现了jump接口");
        cat c= new cat("jia",5);
        System.out.println(c.getName()+c.getAge());
        c.eat();
        c.jump();
        dog d = new dog("a",5);
        System.out.println(d.getName()+d.getAge());
        d.eat();
        d.jump();
    }
}

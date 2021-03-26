package Abstract.AbstractTest;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal a = new Cat();
        a.setName("加菲");
        a.setAge(5);
        System.out.println(a.getName()+a.getAge());
        a.eat();

        a = new Cat("警长",6);
        System.out.println(a.getName()+a.getAge());
        a.eat();

        Animal b = new Dog("泰迪",6);
        System.out.println(b.getName()+b.getAge());
        b.eat();
    }
}

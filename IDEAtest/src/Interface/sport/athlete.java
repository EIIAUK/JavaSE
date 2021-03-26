package Interface.sport;

public abstract class athlete extends people{
    public athlete() {
    }

    public athlete(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("运动员吃的差");
    }

    public abstract void game();
}

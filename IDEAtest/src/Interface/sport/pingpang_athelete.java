package Interface.sport;

public class pingpang_athelete extends athlete implements english{
    @Override
    public void game() {
        System.out.println("打乒乓球比赛");
    }

    @Override
    public void english() {
        System.out.println("学会英语");
    }

    public pingpang_athelete(String name, int age) {
        super(name, age);
    }

    public pingpang_athelete() {
    }
}

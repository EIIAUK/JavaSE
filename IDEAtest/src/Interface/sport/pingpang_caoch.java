package Interface.sport;

public class pingpang_caoch extends caoch implements english{
    @Override
    public void teache() {
        System.out.println("指导乒乓球");
    }

    @Override
    public void english() {
        System.out.println("学会英语");
    }

    public pingpang_caoch() {
    }

    public pingpang_caoch(String name, int age) {
        super(name, age);
    }
}

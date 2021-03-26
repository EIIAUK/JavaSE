package Interface.sport;

public class basketb_caoch extends caoch{
    @Override
    public void teache() {
        System.out.println("指导篮球");
    }

    public basketb_caoch() {
    }

    public basketb_caoch(String name, int age) {
        super(name, age);
    }
}

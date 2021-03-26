package Interface.sport;

import java.security.PublicKey;

public abstract class caoch  extends people{

    @Override
    public void eat() {
        System.out.println("教练吃的好");
    }

    public caoch() {
    }

    public caoch(String name, int age) {
        super(name, age);
    }

    public abstract  void teache();
}

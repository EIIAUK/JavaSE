package InnerClass.匿名内部类_对象;

public class outer {
    public void mentho(){
        new inter(){      //本质是一个对象
            @Override
            public void show() {
                System.out.println("内部匿名类");
            }
        };


        new inter(){
            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
        }.show();

        inter i =  new inter(){      //本质是一个对象
            @Override
            public void show() {
                System.out.println("内部匿名类");
            }
        };
        i.show();
    }
}

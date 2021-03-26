package 接口的默认静态抽象方法;

public class Demo {
    public static void main(String[] args) {
        Inter i = new interImpl();

        i.show();
        i.method();

        Inter.test(); //接口中的静态方法只能被接口调用
        }
    }


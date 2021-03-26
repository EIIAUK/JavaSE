package InnerClass.局部内部类;

public class outer {
    private  int num = 10;
    public void mentho(){
        class inner{
            public  void show(){
                System.out.println(num);
            }

        }
        inner i =new inner();
        i.show();
    }
}

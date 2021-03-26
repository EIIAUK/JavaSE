package Reflect;

public class Student {
    private String name;
    private int age ;
    private String classrom;

    public Student() {
    }

    public Student(String name, int age, String classrom) {
        this.name = name;
        this.age = age;
        this.classrom = classrom;
    }
  /*  private void methon(String name){
       this.name =name;
    }*///错误

    private Student(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClassrom() {
        return classrom;
    }

    public void setClassrom(String classrom) {
        this.classrom = classrom;
    }
    public void method1(){
        System.out.println("method1");
    }
    public void method2(String s){
        System.out.println("method2"+s);
    }
    private void method3(){
        System.out.println("method3");
    }
    public String  method4(String s,int a ){
        return s +","+ a;
    }

    @Override
    public String toString(){
        return "Student{" +
                "name='"+name+'\'' + ", age = "+age+",classroom='"+
                classrom +'\'' + '}';
    }
}

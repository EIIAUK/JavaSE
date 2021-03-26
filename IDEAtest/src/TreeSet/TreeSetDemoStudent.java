package TreeSet;



import java.util.TreeSet;

public class TreeSetDemoStudent {
    public static void main(String[] args) {


    TreeSet<Student> ts = new TreeSet<>();
    Student a= new Student("aaa",111);
    Student b= new Student("bbb",222);
    Student c= new Student("ccc",333);
    ts.add(a);
    ts.add(b);
    ts.add(c);
    for (Student s : ts){
        System.out.println(s.getname() + "---" +s.getage());
    }
}}

package List;

import java.util.ArrayList;


public class studentArryList {
    public static void main(String[] args) {


        ArrayList<Student> arry = new ArrayList<>();

        Student a = new Student("liming", 5);
        Student b = new Student("zhangsan", 6);
        Student c = new Student("zhaosi", 7);

        arry.add(a);
        arry.add(b);
        arry.add(c);

        for (Student student : arry){
            System.out.println(student.getname() +" "+ student.getage());
        }

    }
}


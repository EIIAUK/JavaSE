package ListDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class StudentList {
    public static void main(String[] args) {
        List<Student> slist = new ArrayList<Student>();

       Student lily = new Student("lily",12);
        Student bobo = new Student("bobo",15);
        Student aliy = new Student("aliy",13);
        slist.add(lily);
        slist.add(bobo);
        slist.add(aliy);
        //迭代器遍历
        System.out.println("迭代器遍历");
        Iterator<Student> it =  slist.iterator();
        while (it.hasNext()){
            Student s = it.next();

            System.out.println(s.getname() + s.getage());
        }
        //for循环
        System.out.println("for循环");
        for(int i = 0;i < slist.size();i++)
        {
            Student s = slist.get(i);
            System.out.println(s.getname() + s.getage());
        }
        }
    }




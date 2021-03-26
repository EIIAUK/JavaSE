package TreeSet;



public class Student implements Comparable<Student> {
    private  String name;
    private  int age ;
    public Student(String name , int age ){
        this.name = name;
        this.age = age ;
    }
    public void setname(){
        this.name = name ;
    }
    public  void setage(){
        this.age = age ;
    }
    public String getname(){
        return name;
    }
    public int getage(){
        return  age;
    }

    @Override
    public int compareTo(Student o) {
      //  return 0;   //只返回一个
     //   return 1;    //升序
      //  return -1;  //降序
        int num = o.age - this.age;   //this 前面升序  this 后面降序  比较年龄
        int num2 = num ==0?this.name.compareTo(o.name):num;
        return num2;
    }
}


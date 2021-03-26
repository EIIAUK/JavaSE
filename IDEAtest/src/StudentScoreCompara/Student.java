package StudentScoreCompara;

public class Student {
    private String name;
    private  int chinese;
    private  int math;
    public Student(){}
public  Student(String name, int chinese,int math){
        this.name = name;
        this.chinese=chinese;
        this.math=math;
}
    public  void setname(String name ){
        this.name = name ;
    }
    public void setChinese(int chinese){
        this.chinese = chinese;
    }
    public void setMath(int math){
        this.math =math;
    }
    public String getName(){
        return name;
    }
    public int getChinese(){
        return chinese;
    }
    public  int getMath(){
        return math;
    }

    public int getnum(){
        int num = chinese + math;
        return num;
    }
}


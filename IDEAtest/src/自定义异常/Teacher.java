package 自定义异常;

import java.util.Scanner;

public class Teacher {
    public static void main(String[] args) {
        System.out.println("请输入score");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        TeacherTest t = new TeacherTest();
        try{
            t.checkScore(i);
        }catch (ScoreException e ){
            e.printStackTrace();
        }

    }
}

package File;

import java.io.File;
import java.io.IOException;

//
//delete(); 删除文件或者目录


public class fileDemo {
    public static void main(String[] args) throws IOException {
        //创建路径
        File f1 = new File("E:\\file.txt");
        File f2 = new File("E:\\file");
        File f3 = new File("E:\\file\\mk1\\mk2");

        System.out.println(f1);

        //创建文件/目录  存在返回false 不存在就创建 返回true
        f1.createNewFile();   //创建文件
        f2.mkdir();         //创建目录
        f3.mkdirs();        //多级目录


        System.out.println(f1.isDirectory());
        System.out.println(f1.isFile());
        System.out.println(f1.exists());
        System.out.println( f1.getAbsolutePath());
        System.out.println(f1.getPath());
        System.out.println( f1.getName());
    }
}

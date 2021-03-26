package java文件复制;

import java.io.*;

public class Copy {
    public static void main(String[] args) throws IOException {
        //创建输入流 读
        InputStreamReader isr = new InputStreamReader(new FileInputStream("E:\\javaSE_Test\\IDEAtest、\\src\\java文件复制\\1.TXT"));
        //创建输出流 写
      //  OutputStreamWriter otr =new OutputStreamWriter(new FileOutputStream("E:\\javaSE_Test\\IDEAtest、\\src\\java文件复制\\2.TXT"));
        OutputStreamWriter out =new OutputStreamWriter(new FileOutputStream("E:\\javaSE_Test\\IDEAtest、\\src\\java文件复制\\3.TXT"));

        //一次读一个字节
      /*  int ch;
        while ((ch = isr.read()) != -1){
            otr.write(ch);
        }*/

        //一次读写一个字符数组的数据
        char [] chs = new char[1024];
        int len;
        while ((len= isr.read(chs))!= -1){
            out.write(chs,0,len);
        }
        //释放资源
       // otr.close();
        out.close();
        isr.close();
    }
}

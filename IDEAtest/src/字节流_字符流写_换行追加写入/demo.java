package 字节流_字符流写_换行追加写入;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class demo {
    public static void main(String[] args) throws IOException {

        FileOutputStream fos = new FileOutputStream("fos.txt",true);  //末尾追加写入
    //写数据
        for (int i =0 ; i<10; i++){
            fos.write("hello".getBytes());
            fos.write("\r\n".getBytes());
        }
        fos.close();//释放资源
    }
}

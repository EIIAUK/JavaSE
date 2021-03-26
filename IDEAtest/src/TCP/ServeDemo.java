package TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class ServeDemo {
    public static void main(String[] args) throws IOException {
        //创建服务器端的Socket对象（ServerScoket）
        ServerSocket ss = new ServerSocket(10001);
        //监听客户端链接，返回一个Socket对象
        Socket s = ss.accept();

        //获取输入流 读取数据
        InputStream is = s.getInputStream();
        byte[] byt = new byte[1024];
        int len = is.read(byt);
        String data = new String(byt,0,len);
        System.out.println("服务器"+data);

        //给出反馈
        OutputStream os = s.getOutputStream();
        os.write("数据收到：".getBytes());
        //释放资源
     //   s.close();
        ss.close();
    }
}

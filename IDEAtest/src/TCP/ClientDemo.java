package TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        //创建客户端的Socket对象
        Socket s= new Socket("192.168.1.1",10001);
        //获取输出流
        OutputStream os =s.getOutputStream();
        os.write("hello".getBytes());

        //获取输出流，写数据
        InputStream is = s.getInputStream();
        byte[] byt = new byte[1024];
        int len = is.read(byt);
        String data = new String(byt,0,len);
        System.out.println("客户端"+data);

        //释放资源
        s.close();
    }
}

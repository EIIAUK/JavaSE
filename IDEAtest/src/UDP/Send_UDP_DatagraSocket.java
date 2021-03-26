package UDP;

import java.io.IOException;
import java.net.*;
import java.nio.charset.StandardCharsets;

/*UDP发送步骤：
1.创建发送Socket对象（DatagramSocket）
2.创建数据，并且把数据打包
3.调用DatagramSocket对象的方法发送数据
4.关闭发送端*/
public class Send_UDP_DatagraSocket {
    public static void main(String[] args) throws IOException {
     //   1.创建发送Socket对象（DatagramSocket）
        DatagramSocket ds = new DatagramSocket();
        //2.创建数据，并且把数据打包
      //  DatagramPacket dp = new DatagramPacket(byte[] buf,int leanth,InetAddress address,int port);

        byte[] bys = "Hello,This is a message from UDP".getBytes();
        //代码优化
       int length = bys.length;
        InetAddress address = InetAddress.getByName("10.210.171.186");
        int port = 10086;
        //3.调用DatagramSocket对象的方法发送数据
        DatagramPacket dp = new DatagramPacket(bys,length,address,port);
        //代码优化
     //   DatagramPacket dp = new DatagramPacket( bys, bys.length,InetAddress.getByName("116.128.211.16"),10086);
        //发送
        ds.send(dp);

        //4.关闭发送端*
        ds.close();




    }
}

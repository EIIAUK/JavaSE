package UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/* UDP接收数据的步骤
    1.创建接受端的Socket对象（DatagramSocket）
    2.创建一个数据包，用于接收数据
    3.调用DaragramSocker对象的方法接受数据
    4.解析数据包，并把数据在控制台现实
    5.关闭接受端*/
public class Recive_UDP {
    public static void main(String[] args) throws IOException {
       // 1.创建接受端的Socket对象（DatagramSocket）
        DatagramSocket ds= new DatagramSocket(10086);
        // 2.创建一个数据包，用于接收数据
       byte [] bys =new byte[1024];
       DatagramPacket dp = new DatagramPacket(bys, bys.length);
       // 3.调用DaragramSocker对象的方法接受数据
       ds.receive(dp);

       // 4.解析数据包，并把数据在控制台现实
       byte[] datas = dp.getData();
       String dataString = new String(datas);
        System.out.println("数据是"+dataString);

        ds.close();


    }
}

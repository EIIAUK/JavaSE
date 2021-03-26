package UDP通信练习;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class recive {
    public static void main(String[] args) throws IOException {

        DatagramSocket ds = new DatagramSocket(10086);
        while (true){
        byte[] byts = new byte[1024];
        int Len = byts.length;


        DatagramPacket dp = new DatagramPacket(byts,Len);

        ds.receive(dp);

        byte[] datas = dp.getData();
        String data = new String(datas);
        System.out.println(" data:"+data);
          //  System.out.println("数据是："+new String(dp.getData(),0,dp.getLength()));
      //  ds.close();

                     }
    }
}

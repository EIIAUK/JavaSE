package UDP通信练习;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
import java.util.Scanner;

public class send {

    public static void main(String[] args) throws IOException {



            DatagramSocket ds = new DatagramSocket();
//            Scanner sc = new Scanner(System.in);
//            String in = sc.next();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //一行字符一行字符输入

       String line ;

        while((line= br.readLine())!=null) {   //读取不为空

   /*         String line  = br.readLine();   这样赋值的话再while语句中就无法刷星readline 的新数值

    while (line!=null) {   //读取不为空
*/
            if ("886".equals(line)) {
                  break;
            }
           byte[] bys = line.getBytes();

            //InetAddress address = InetAddress.getByName("10.210.171.186");
        // int port = 10086;
            DatagramPacket dp = new DatagramPacket(bys,  bys.length, InetAddress.getByName("10.210.171.186"), 10086);
            ds.send(dp);
        }
            ds.close();

    }
}

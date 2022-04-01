package socket;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * 聊天室客户端
 */
public class Client {
    /*
       java.net.Socket
       Socket封装了TCP协议的通讯细节，使用它可以和服务器建立TCP连接，
       读写完成数据交换
     */
    private Socket socket;
     /*
        构造方法，用于初始化客户端
     */
    public Client() {
        try {
            System.out.println("正在连接服务端");
            socket = new Socket("localhost", 8088);
            System.out.println("已连接服务端");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    /*
         客户端开始工作方法
    */
    public void start() {

        try {
            OutputStream out = socket.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(out, StandardCharsets.UTF_8);
            BufferedWriter bw = new BufferedWriter(osw);
            PrintWriter pw = new PrintWriter(bw,true);

            Scanner sc = new Scanner(System.in);
            while (true) {
                String line = sc.nextLine();
                if ("exit".equalsIgnoreCase(line)) {
                    break;
                } pw.println(line);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) {
        Client client = new Client();
        client.start();
    }
}

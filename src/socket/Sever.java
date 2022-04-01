package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/**
 * 聊天室服务器
 */
public class Sever {
    /**
     * java.net.ServerSocket
     * ServerSocket是运行在服务端上的。其主要有两个作用
     * 1:向服务端申请服务端口(客户端Socket就是通过这个端口与服务端建立连接的)
     * 2:监听服务端口，一旦客户端连接会立即常见一个Socket，通过该Socket与客户端交互
     *
     * 如果我们将Socket比喻为"电话"，那么ServerSocket相当于"总机"
     */
    private ServerSocket serverSocket;

    public Sever() {
        try {
            /*
                ServerSocket在创建的时候要申请一个固定的端口号，客户端才能通过这个
                端口建立连接。
                如果该端口被当前操作系统中其他程序使用了，那么这里实例化会抛出异常:
                java.net.BindException:address already in use
                绑定异常:地址被使用了
             */
            System.out.println("正在启动服务端。。。");
            serverSocket = new ServerSocket(8088);
            System.out.println("服务端启动完毕");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void start() {
        try {
/*
                ServerSocket的accept方法是一个阻塞方法。
                开始等待客户端的连接，一旦一个客户端通过端口建立连接，此时accept方法
                会立即返回一个Socket实例。通过该实例可以与该客户端进行交互。
                相当于是接电话的动作。
                阻塞方法:调用后，程序就"卡住"不往下执行了。
             */
            Socket socket = null;
            while (true) {
                System.out.println("等待客户端连接");
                socket = serverSocket.accept();
                System.out.println("一个客户端连接了!");
                //启动一个线程来处理该客户端的交互
                ClientHandler clientHandler = new ClientHandler(socket);
                Thread thread = new Thread(clientHandler);
                thread.start();




            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        Sever sever = new Sever();
        sever.start();

    }

    private class ClientHandler implements Runnable {
        private Socket socket;
        private String host;//记录远端计算机的地址信息

        public ClientHandler(Socket socket) {
            this.socket = socket;
            host = socket.getInetAddress().getHostAddress();
        }
        public void run() {
            try {
                InputStream in = socket.getInputStream();
                InputStreamReader isr = new InputStreamReader(in, StandardCharsets.UTF_8);
                BufferedReader br = new BufferedReader(isr);
                String line;
                while ((line = br.readLine() )!= null) {
                    System.out.println(host+"发送:" + line);
                }
            } catch (IOException e) {
               // e.printStackTrace();
            } finally {
            }
        }
    }
}

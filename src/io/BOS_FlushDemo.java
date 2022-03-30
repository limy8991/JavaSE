package io;


import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

    /**
     * 缓冲输出流写出数据的缓冲区问题
     *
     */
    public class BOS_FlushDemo {
        public static void main(String[] args) throws IOException {
            FileOutputStream fos = new FileOutputStream("bos.txt");
            BufferedOutputStream bos = new BufferedOutputStream(fos);

            String line = "我是xxx！";
            byte[] data = line.getBytes(StandardCharsets.UTF_8);
            bos.write(data);
            System.out.println("完毕");

            bos.close();
        }}



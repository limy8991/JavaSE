package io;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class PWDemo2 {
    public static void main(String[] args) throws FileNotFoundException {
        FileOutputStream fos = new FileOutputStream("ff.txt",true);//文件输出流
        OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);//字符流
        BufferedWriter bw = new BufferedWriter(osw);//缓冲流
        PrintWriter pw = new PrintWriter(bw);//打印输出
        pw.println(123);
        pw.println('a');
        pw.println("123");
        System.out.println("完毕");
        pw.close();
    }
}

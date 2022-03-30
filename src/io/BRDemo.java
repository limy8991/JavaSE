package io;

import java.io.*;

/**
 * 缓冲字符输入流
 * java.io.BufferedReader
 * 块读文本数据加速，并且可以按行读取字符串
 */
public class BRDemo {
    public static void main(String[] args) throws IOException {
        //将当前源代码输出到控制台上
        FileInputStream fis = new FileInputStream("./src/io/BRDemo.java");
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        /*
        BufferedReader提供了一个读取一行字符串的方法
        String readerLIne（）
        该方法会连续读取若干字符，当遇到换行符停止，然后将换行符之前的内容以一个
        字符串形式返回
        注：这是内存操作，因为第一次调用readLine时，缓冲流会将数据先一次性读取到
        内部的char数组中（8k的字符），然后返回内部的一行字符串
        如果读取到了末尾，则返回null

         */
        String line = br.readLine();
        while ( (line =br.readLine())!=null) {
            System.out.println(line);

        }


        br.close();
    }
}

package io;

import java.io.*;

/**
 * 缓冲字符流
 * java.io.BufferedWriter和BufferedReader
 * 缓冲字符流是一种高级的字符流，作用是块写文本数据加速的
 *
 *
 * java.io.PrintWriter具有自动行刷新的缓冲字符输出流，内部总是连接BufferedWriter
 * 更常用
 */
public class PWDemo1 {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        PrintWriter pw = new PrintWriter("pw.txt","utf-8");
        pw.println("asdasdasdasd");
        pw.println("123123123123");
        System.out.println("结束");
        pw.close();
    }
}

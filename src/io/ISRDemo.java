package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

/**
 * 转换流
 * 测试读取文本数据
 */
public class ISRDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("osw.txt");
        InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
/*
字符流的int read（）方法是用来读取一个字符，
将对应的char存入返回的值存在低16位
如果返回值为-1 则表示读取到了末尾
 */
        int d;
        while ((d = isr.read()) != -1){

        System.out.print((char)d);
        }

        isr.close();
    }

}

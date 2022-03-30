package io;

import javax.sound.sampled.Line;
import java.io.*;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        FileOutputStream fos = new FileOutputStream("1.txt", true);
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);
        PrintWriter pw = new PrintWriter(bw,true);//自动行刷新
        while (true) {
            String line = sc.nextLine();
            pw.println(line);
            if ("exit".equals(line)) {
                break;
            }
        }
        pw.close();

    }
}

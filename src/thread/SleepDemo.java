package thread;

import java.util.Scanner;

public class SleepDemo {
    public static void main(String[] args) {

        System.out.println("start");
        Scanner sc = new Scanner(System.in);
        System.out.println("shuru");
        for (int num = sc.nextInt(); num > 0; num-- ) {
            System.out.println(num);
            try {
                Thread.sleep(1230);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("end");
    }
}

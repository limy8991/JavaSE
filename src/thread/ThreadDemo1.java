package thread;

import javax.xml.transform.Source;

/**
 * 多线程
 * 线程是一个程序的单一顺序执行流程。多个单一流程一起运行就是多线程。
 * 多线程是并发执行的。
 *
 * 创建线程有两种方式，第一种:继承Thread并重写run方法
 */
public class ThreadDemo1 {
    public static void main(String[] args) {
        Thread t1 = new MyThread1();
        Thread t2 = new MyThread2();

        t1.start();
        t2.start();
    }

}
class MyThread1 extends Thread {
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("你是谁啊？");
        }
    }
}
/*
    第一种创建方式的优点:结构简单，利于匿名内部类创建

    缺点:
    1:由于java是单继承的，这导致如果继承了Thread就无法再继承其他类了
    2:在定义线程时定义了线程任务，这导致任务与线程存在了必然的耦合关系不利于线程的重用
 */
class MyThread2 extends Thread {
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("开门啊，老乡，我们是解放军");
        }
    }
}

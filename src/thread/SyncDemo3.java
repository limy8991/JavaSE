package thread;



/**
 * 静态方法上如果使用synchronized，那么该方法一定是同步的。
 */
public class SyncDemo3 {
    public static void main(String[] args) {
//        Boo b1 = new Boo();
//        Boo b2 = new Boo();
        Thread t1 = new Thread(){
            public void run(){
                Boo.dosome();
            }
        };
        Thread t2 = new Thread(){
            public void run(){
                Boo.dosome();
            }
        };
        t1.start();
        t2.start();
    }
}

class Boo {
    //public synchronized static void dosome(){
    public  static void dosome(){
        synchronized (Boo.class) {
            try {
                Thread t = Thread.currentThread();
                System.out.println(t.getName() + ":正在执行dosome方法...");
                Thread.sleep(5000);
                System.out.println(t.getName() + ":执行dosome方法完毕!");
            } catch (InterruptedException e) {

            }

            {
            }

        }}}






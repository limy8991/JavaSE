package thread;

public class SleepDemo2 {
    /**
     * 当一个线程调用sleep方法处于睡眠阻塞的过程中其interrupt()方法被掉用，那么这时会中断
     * 该睡眠阻塞，并且sleep方法会抛出中断异常
     */
    public static void main(String[] args) {
        Thread lin = new Thread() {
            public void run() {
                System.out.println("睡一觉吧");
                try {
                    sleep(1000000);
                } catch (InterruptedException e) {
                    System.out.println("干嘛呢，破相了");
                }
                System.out.println("醒了");
            }
        };
        Thread huang = new Thread() {

            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("大锤80");
                    try {
                        sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
                System.out.println("搞定");
                lin.interrupt();
            }

        };
        lin.start();
        huang.start();


    }

}

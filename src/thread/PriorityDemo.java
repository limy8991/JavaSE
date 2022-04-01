package thread;

public class PriorityDemo {
    public static void main(String[] args) {
        Thread min = new Thread();
        for (int i = 0; i < 10000; i++) {
            System.out.println("min");
        }
        Thread max = new Thread();
        for (int i = 0; i < 10000; i++) {
            System.out.println("max");
        }
        Thread norm = new Thread();
        for (int i = 0; i < 10000; i++) {
            System.out.println("nor");
        }
        min.setPriority(Thread.MAX_PRIORITY);
     //   max.setPriority(Thread.MIN_PRIORITY);
        norm.setPriority(Thread.NORM_PRIORITY);

        min.start();
        max.start();
        norm.start();
    }
}

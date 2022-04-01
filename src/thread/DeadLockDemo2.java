package thread;

public class DeadLockDemo2 {

        private static Object chopsticks = new Object();

        private static Object spoon = new Object();

        public static void main(String[] args) {
            Thread np = new Thread() {
                @Override
                public void run() {
                    try {
                        System.out.println("北方人：开始吃饭");
                        System.out.println("北方人去拿筷子。。");
                        synchronized (chopsticks) {
                            System.out.println("北方人拿起了筷子吃饭了");
                            Thread.sleep(5000);
                            System.out.println("北方人吃完了饭去拿勺。。");
                            synchronized (spoon) {
                                System.out.println("北方人拿起了勺子，开始喝汤");
                                Thread.sleep(5000);
                                System.out.println("北方人吃完了");
                            }
                            System.out.println("北方人放下了勺子");
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            };
            Thread sp = new Thread() {
                @Override
                public void run() {
                    try {
                        System.out.println("南方人：开始吃饭");
                        System.out.println("南方人去拿勺子。。");
                        synchronized (chopsticks) {
                            System.out.println("南方人拿起了勺子吃饭了");
                            Thread.sleep(5000);
                            System.out.println("南方人吃完了饭去拿勺。。");
                        synchronized (spoon) {
                            System.out.println("南方人拿起了筷子，开始吃饭");
                            Thread.sleep(5000);
                            System.out.println("南方人吃完了饭，放下筷子");
                        }
                        System.out.println("南方人放下了勺子");
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            };
            np.start();
            sp.start();
        }
    }



package thread;

public class SyncDemo4 {
    public static void main(String[] args) {
        Foo foo1 = new Foo();
        Foo foo2 = new Foo();
        Thread t1 = new Thread() {
            public void run() {
                foo1.methodA();
             //   foo2.methodB();
            }
        };
        Thread t2 = new Thread() {
            public void run() {
               // foo1.methodB();
               // foo2.methodA();
            }
        };
        t1.start();
        t2.start();
    }
}

class Foo {
    public synchronized void methodA(){
        try {
            Thread t = Thread.currentThread();
            System.out.println(t.getName() + "a");
            Thread.sleep(3000);
            System.out.println(t.getName() + "a finish");

        } catch (InterruptedException e) {
        }
    }

    public  void methodB() {
        //synchronized (this){
        synchronized (Foo.class) {
            try {
                Thread t = Thread.currentThread();
                System.out.println(t.getName() + "b");
                Thread.sleep(3000);
                System.out.println(t.getName() + "b finish");

            } catch (InterruptedException e) {

            }
        }

    }

}

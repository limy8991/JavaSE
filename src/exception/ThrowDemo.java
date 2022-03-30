package exception;

import sun.management.Agent;

/**
 * 异常的抛出
 * Throw关键字可以主动对外抛出一个异常
 * 通常：
 *1.程序出现了异常，但是该异常不应当在当前代码块中被解决时，可以主动将其抛出去
 *2.程序可以运行，但是以不满足业务场景要求时可以当作异常抛出
 */
public class ThrowDemo {
    public static void main(String[] args) throws Exception {
        System.out.println("start");
        Person p = new Person();
        //满足语法但不满足业务场景
        p.setAge(90);
        try {

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("age="+p.getAge());
        System.out.println("end");

    }
}

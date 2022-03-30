package exception;

/**
 * 异常处理机制的finally块
 * finally块时异常处理机制的最后一块，它可以跟咋try之后或者最后一个catch之后
 * finally可以保证只要恒旭执行到try语句块中，无论try中是否出现异常，finally最终都会必定执行
 * 通常我们将释放资源这类操作放在finally中确保运行，例如io操作后最终的close（）调用
 */
public class FinallyDemo {
    public static void main(String[] args) {
        try {
            String line = "null";
            System.out.println(line.length());
            //try语句块中出错代码以下的内容均不执行

            System.out.println("123");
            return;
        } catch (Exception e) {
            System.out.println("出错了");

        }finally {//finally有强制性,必须经过finally之后才会通过return结束方法
            System.out.println("finally中的代码执行了");
        }
        System.out.println("程序结束");
    }
}

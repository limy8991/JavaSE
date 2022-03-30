package exception;

/**
 * java的异常处理机制
 * Java中所欲异常的超类为Throwable，其派生了两个子类型：Error和Exception
 * Error表示系统错误，通常是泵在程序运行区间被解决的错误
 * Exception表示程序级别的错误，通常是由于在逻辑等导致的问题，
 * 可以在程序运行期间被解决
 *
 * 异常处理机制中的try——catch
 *
 * 语法：
 * tty{
 *     坑你出现异常的代码片段
 * }catch(xxxxxException e){
 *     try 预计快中出现xxxxxException后的解决办法
 * }
 */
public class TryCatchDemo {
    public static void main(String[] args) {
        System.out.println("start");
        try {
            // String line = "";
            String line = "a";
            System.out.println(line.length());
            System.out.println(line.charAt(1));
            System.out.println(Integer.parseInt(line));

        }
        catch (NullPointerException|StringIndexOutOfBoundsException e) {
            System.out.println("异常");
        }
        catch (Exception e) {
            System.out.println("通用异常");
        }
         /* catch (StringIndexOutOfBoundsException s) {
           System.out.println("字符串下标越界异常");
        }*/

        System.out.println("end");

    }
}

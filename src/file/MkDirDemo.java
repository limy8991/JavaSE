package file;

import java.io.File;
import java.io.IOException;

/**
 * directory:目录
 * make:做
 * 注:mkdir是linux中的一条命令。就是make directory的简写，意思是创建目录
 *
 * 使用File创建一个目录
 */
public class MkDirDemo {
    public static void main(String[] args) throws IOException {
        //在当前目录下新建一个目录:demo
//        File dir = new File("./demo");
        File dir = new File("demo");

//        File dir = new File("./a/b/c/d/e/f/demo");

        if(dir.exists()){
            System.out.println("该目录已存在!");
        }else{
//            dir.mkdir();//创建目录时要求所在的目录必须存在，否则创建失败
            dir.mkdirs();//会一同将不存在的父目录全部创建出来(推荐使用该方法)
            System.out.println("该目录已创建!");
        }
    }
}

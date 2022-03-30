package file;

import java.io.File;
import java.io.IOException;

/**
 * create: 创建
 * exists:存在
 * 使用File新建一个文件
 */
public class CreateNewFileDemo {
    public static void main(String[] args) throws IOException {
        //在当前项目目录下新建一个文件:test.txt
        File file = new File("./test.txt");
        /*
            创建文件的前提是该文件所在的目录必须存在，如果目录不存在则创建时会抛出异常:
            java.io.IOException: 系统找不到指定的路径。
         */
//        File file = new File("./mydir/test.txt");
        //boolean exists() 判断file对应的路径是否存在该文件或目录
        if(file.exists()){
            //存在
            System.out.println("该文件已存在!");
        }else{
            //不存在
            file.createNewFile();
        }

    }
}




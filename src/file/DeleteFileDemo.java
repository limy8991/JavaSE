package file;

import java.io.File;

/**
 * delete:删除
 * 删除一个文件
 */
public class DeleteFileDemo {
    public static void main(String[] args) {
        // 将当前目录下的test.txt文件删除
//        File file = new File("./abc/test.txt");
        // "./"在相对路径中是可以忽略不写的，默认就是从"./"开始的
        File file = new File("test.txt");
        if(file.exists()){
            file.delete();//将file表示的文件或目录删除
            System.out.println("该文件以删除!");
        }else{
            System.out.println("该文件不存在!");
        }

    }
}










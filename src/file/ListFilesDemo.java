package file;

import java.io.File;

/**
 * list:列表
 * 使用File访问一个目录中的子项
 */
public class ListFilesDemo {
    public static void main(String[] args) {
        //查看当前目录下的所有子项
//        File dir = new File(".");//当前目录
        File dir = new File("./src/file");
        /*
             boolean isFile()
             判断当前File表示的是否为一个文件
             boolean isDirectory()
             判断当前File表示的是否为一个目录
         */
        if(dir.isDirectory()){
            /*
                File[] listFiles()
                返回当前目录中的所有子项，每个子项都包含在返回的数组中作为一个元素。
             */
            File[] subs = dir.listFiles();
            System.out.println("当前目录中共包含"+subs.length+"个子项");
            for(int i=0;i<subs.length;i++){
                File sub = subs[i];
                System.out.println(sub.getName());
            }
        }



    }
}





package file;

import java.io.File;
import java.io.FileFilter;

/**
 * 获取./src/file目录下所有名字以"D"开头的子项
 */
public class Test {
    public static void main(String[] args) {
        File dir = new File("./src/file");
        if(dir.isDirectory()){
            FileFilter filter = new FileFilter() {
                public boolean accept(File file) {
                    String name = file.getName();
                    System.out.println("正在过滤:"+name);
                    return name.startsWith("D");
                }
            };

            File[] subs = dir.listFiles(filter);
            for(int i=0;i<subs.length;i++){
                System.out.println(subs[i].getName());
            }

        }
    }
}

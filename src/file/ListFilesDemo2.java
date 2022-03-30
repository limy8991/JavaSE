package file;

import java.io.File;
import java.io.FileFilter;

/**
 *
 * filter:过滤器
 * accept:接受
 * contains:包含
 *
 * 有条件的获取一个目录中的子项
 *
 * File有一个重载的listFiles方法，允许我们传入一个文件过滤器，并在该过滤器上定义过滤
 * 条件，之后listFiles执行完毕会将目录中所有满足过滤器要求的子项进行返回
 */
public class ListFilesDemo2 {
    public static void main(String[] args) {
        //获取当前目录中名字里含有字母"o"的子项
        File dir = new File(".");
        if(dir.isDirectory()){
            /*
                File listFiles(FileFilter filter)
             */
            FileFilter filter = new FileFilter() {
                public boolean accept(File file) {
                    System.out.println("正在过滤:"+file.getName());
                    return file.getName().contains("o");
                }
            };
            /*
                File[] listFiles(FileFilter filter)
                该方法会将该目录中每一个子项都作为参数先传给filter的accept方法，
                只有accept方法返回为true的子项最终才会被包含在返回的File[]数组
                中进行返回。
             */
            File[] subs = dir.listFiles(filter);
            System.out.println("共:"+subs.length+"个子项");
            for(int i=0;i<subs.length;i++){
                File sub = subs[i];
                System.out.println(sub.getName());
            }
        }
    }
}

class MyFilter implements FileFilter{
    @Override
    public boolean accept(File file) {
        //过滤条件是名字中含有"o"的
        String name = file.getName();//获取该file表示的文件或目录的名字

//        String regex = ".*o.*";//正则表达式写法
//        boolean match = name.matches(regex);

//        name.indexOf("o")>=0;

        return name.contains("o");
    }
}


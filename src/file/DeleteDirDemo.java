package file;

import java.io.File;

/**
 * 删除一个目录
 */
public class DeleteDirDemo {
    public static void main(String[] args) {
        //将当前目录下的demo目录删除
        File dir = new File("./demo");
        if(dir.exists()){
            //删除目录时只有空目录可以被删除!
            dir.delete();//将该目录删除
            System.out.println("该目录已删除!");
        }else{
            System.out.println("该目录不存在!");
        }
    }
}






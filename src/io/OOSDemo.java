package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * 对象流
 * java.io.ObjectOutputStream和ObjectInputStream
 * 他们是一对高级流，在流连接中的作用是进行对象的序列化与反序列化
 * 对象序列化：
 */
public class OOSDemo  {
    public static void main(String[] args) throws IOException {
/*将一个Person对象写入文件
1.先将person对象转换为一组字符
2.将字节写入文件

流连接：
         序列化       持久化
           v           v
对象----->对象化----->文件流------>文件
* */

        String name = "李李李";
        int age = 18;
        String gender = "男";
        String[] otherInfo = {"哈哈哈哈哈哈哈哈哈哈哈，哈哈哈哈"};

        Person p = new Person(name, age, gender, otherInfo);
        FileOutputStream fos = new FileOutputStream("person.obj");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
/*
  对象输出流提供了序列化方法
  void writeObject（Object obj）
  将给定的对象转换为一组字节并输出，但是需要注意：写出的对象所属的类必须
  实现接口java.io.Serializable
  否则该方法会抛出异常java.io.NotSerializableException

*/
        oos.writeObject(p);
        System.out.println("完毕");

        oos.close();
    }
}

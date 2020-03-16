package demo.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Created by Cherie on 2019/3/12.
 */
public class Buffer {

    public static void main(String[] args) throws Exception {
        FileInputStream fin = new FileInputStream(new File("/Users/Cherie/wjn/project/feru/src/main/java/demo.io/buffer.txt"));
        FileChannel fc = fin.getChannel();
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
        fc.read(byteBuffer);
        fc.close();
        byteBuffer.flip();//读写转换
    }

    public static void nioCopyFile(String resource, String destination) throws IOException {
        FileInputStream fis = new FileInputStream(resource);
        FileOutputStream fos = new FileOutputStream(destination);
        FileChannel readChannel = fis.getChannel(); // 读文件通道
        FileChannel writeChannel = fos.getChannel(); // 写文件通道
        ByteBuffer buffer = ByteBuffer.allocate(1024); // 读入数据缓存
        while (true) {
            buffer.clear();
            int len = readChannel.read(buffer); // 读入数据
            if (len == -1) {
                break; // 读取完毕
            }
            buffer.flip();
            writeChannel.write(buffer); // 写入文件
        }
        readChannel.close();
        writeChannel.close();
    }

}

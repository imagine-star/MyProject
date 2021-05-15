package Question;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @Author STAR
 * @Description 测试文件读写
 * @Date 2021/3/21 11:25
 */
public class FileTest {

    public static void main(String[] args) {
        File file = new File("C:\\input.txt");
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream(file);
            byte[] bytes = inputStream.readAllBytes();
            String fileString = new String(bytes);
            System.out.println(fileString);
            fileString = null;
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}

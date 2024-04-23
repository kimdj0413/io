import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx {
    public static void main(String[] args) {
        byte[] data = { 7, 51, 3, 4, -1, 24 };
        FileOutputStream fos = null;

        try {
            fos = new FileOutputStream("c:\\temp\\test.data",true); //append : true 면 파일에 추가
            for (byte k : data) {
                fos.write(k);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

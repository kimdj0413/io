import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {
    public static void main(String[] args) {
        FileReader fr = null;
        try {
            fr = new FileReader("c:\\windows\\system.ini");
            int c;
            while((c=fr.read()) != -1){
                System.out.print((char)c);
            }
            fr.close();
        } catch (FileNotFoundException e) {
            System.out.println("파일없음");        
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(fr != null)
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

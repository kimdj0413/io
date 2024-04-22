import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest { 
    public static void main(String[] args) {
        try(FileReader fr = new FileReader("c:\\windows\\system.ini")) {
            int c;
            while((c=fr.read()) != -1) {
                System.out.println((char)c);
            }
        } catch(FileNotFoundException e){
            System.out.println("파일없다.");
            e.printStackTrace();
        } catch(IOException e){
            e.printStackTrace();
        }
        // fr.close(); 자동으로.
    }
}
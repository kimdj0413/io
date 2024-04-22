import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileWriterEx {
    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);

        FileWriter fw = null;

        try {
            fw = new FileWriter("c:\\temp\\test.txt");
            int c;
            while((c=isr.read()) != -1) {
                fw.write(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(isr != null) {
                try{
                    isr.close();
                } catch(IOException e) {
                    e.printStackTrace();    
                }
            }
        }
    }
}

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class bai1 {
    public static void main(String[] args) throws FileNotFoundException {
        FileWriter write = null;
        String str=new String();
        try {

            FileReader read = new FileReader("test");
        }catch (IOException a){
            a.printStackTrace();
        }
    }
}
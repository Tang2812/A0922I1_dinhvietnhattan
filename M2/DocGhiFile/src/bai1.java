import javax.sound.sampled.Line;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

import static java.nio.charset.StandardCharsets.*;

public class bai1 {
    public static void main(String[] args) throws FileNotFoundException {
        String str="";
        String line="";

        File f= new File("C:\\codeGym\\A0922I1_dinhvietnhattan\\M2\\DocGhiFile\\src\\test");
        try{
            PrintWriter pw= new PrintWriter("C:\\codeGym\\A0922I1_dinhvietnhattan\\M2\\DocGhiFile\\src\\result");
            BufferedReader br = Files.newBufferedReader(f.toPath(), StandardCharsets.UTF_8);
        while (true){
            line=br.readLine();
            if(line==null) {
                break;

            }else {
                System.out.println(line);
            pw.println(line);
            pw.flush();
            }
        }
        pw.close();
        }catch (Exception e){
            e.printStackTrace();

        }
    }
}
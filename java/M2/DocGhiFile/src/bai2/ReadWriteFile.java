package bai2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.nio.file.Files;
import java.util.List;

public class ReadWriteFile {
    public static final String BLANK = "";
    public static final String DELIMITER = ",";

    public static void readToFile(String path, List<Country> cList){
        String str=null;
        File f=new File(path);
        try {
            BufferedReader br= Files.newBufferedReader(f.toPath());
            while(true){
                str=br.readLine();
                if(str==null){
                    break;
                }
                if(str.trim().equals(BLANK)){
                    continue;
                }
                String[] result = str.split(DELIMITER);
                Country temp= new Country(result);
                cList.add(temp);
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

import com.sun.media.sound.InvalidDataException;

import java.io.*;
import java.util.List;

public class file {
    public static void write(String path, List<product> list) {
        try (ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream(path))) {
            stream.writeObject(list);
            stream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void read(String path, List<product> list) {
        try (ObjectInputStream stream = new ObjectInputStream(new FileInputStream(path))) {
            list.addAll((List<product>)stream.readObject());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void search(String path, String code, List<product> list) {
        read(path, list);
        int d = 0;
        for (product tmp : list) {
            if (code.equals(tmp.code) == true) {
                System.out.println(tmp.toString());
                d++;
            }
        }
        if(d==0){
            System.out.println("not found!");
        }
    }
}

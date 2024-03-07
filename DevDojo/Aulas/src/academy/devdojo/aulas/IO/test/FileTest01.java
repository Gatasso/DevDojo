package academy.devdojo.aulas.IO.test;

import javax.imageio.IIOException;
import java.io.File;
import java.io.IOException;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println(isCreated);
            System.out.println(file.getAbsolutePath());
            System.out.println(file.getPath());
            System.out.println("Is directory? "+ file.isDirectory());
            boolean exists = file.exists();
            if (exists){
                System.out.println("Deleted " + file.delete());
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}

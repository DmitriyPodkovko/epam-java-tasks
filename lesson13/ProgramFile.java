package ua.univer.lesson13;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ProgramFile {
    public static void main(String[] args) throws IOException {


        //  createFiles();

        //     System.out.println(dir.list());
       // writeToFile("f.dat");
    }

    private static void createFiles() throws IOException {
        File dir = new File("mydir");
        System.out.println(dir);
        if (!dir.exists()) dir.mkdir();
        if (dir.exists() && dir.isDirectory()){
            for (int i = 0; i < 10; i++) {
               try( FileWriter fw = new FileWriter(dir+File.separator+"f"+i+".csv");)
               {
                fw.write("value;"+i);
                fw.flush();
               }
            }
        }
    }

    private static void writeToFile(String filename) throws IOException {
        File f = new File(filename);
        System.out.println(f.exists());
        FileWriter fw = new FileWriter(f,true);
        for (int i = 0; i < 10; i++) {
            fw.write(Integer.toString(i));
            fw.flush();
        }
        fw.close();
    }
}

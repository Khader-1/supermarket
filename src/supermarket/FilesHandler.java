package supermarket;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FilesHandler {

    final static private String PATH = System.getProperty("user.home") + "\\supermarket";

    public static void check(String path, boolean isDir) throws IOException {
        File file = new File(PATH + path);
        if (file.exists()) {
            System.out.println("This file is already there");
        } else {
            if (isDir) {
                file.mkdir();
            } else {
                file.createNewFile();
            }
        }

    }

    public static Scanner read(String path) throws IOException {
        check(path, false);
        
        return new Scanner(new File(PATH + path));
    }
    
    public static PrintWriter wirte(String path) throws IOException{
        check(path, false);
        return new PrintWriter(new File(PATH + path));
    }
    
    public static void init() throws IOException{
        check("", true);
    }
}

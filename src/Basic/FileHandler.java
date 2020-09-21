package Basic;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class FileHandler {
    public static String readFile(String path){
        try{
            Scanner scanner = new Scanner(new File(path));
            String text = "";

            while(scanner.hasNext()){
                text += scanner.nextLine();
                text += "\n";
            }
            return text;
        }catch (FileNotFoundException f){
            System.out.println(f);
            return null;
        }
    }

    public static void writeFile(String path, String text){
        try{
            PrintStream ps = new PrintStream(new File(path));
            ps.println(text);
        }catch(FileNotFoundException f){
            System.out.println(f);
        }
    }
}

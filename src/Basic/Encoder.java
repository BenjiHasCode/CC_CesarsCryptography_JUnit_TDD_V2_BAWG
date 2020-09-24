package Basic;

import java.util.Random;
import java.util.Scanner;

public class Encoder {
    public static String encode(String text){
        //encode text
        Random random = new Random();
        int randomNumber = random.nextInt(10) + 1;
        String encoded = "";

        Scanner scanner = new Scanner(text);
        while(scanner.hasNext()){
            String line = scanner.nextLine();

            for(int i = 0; i < line.length(); i++){
                if (line.charAt(i) != ' '){
                    encoded += (char)(line.charAt(i) + randomNumber);
                }else if (line.charAt(i) == ' '){
                    encoded += " ";
                }
                else{
                    System.out.println("Something went wrong!");
                }
            }
            encoded += "\n";
        }
        return encoded;
    }
}
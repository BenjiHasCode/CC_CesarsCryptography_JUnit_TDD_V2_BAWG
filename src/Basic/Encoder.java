package Basic;

import java.util.Random;

public class Encoder {
    public static String encode(String text){
        //encode text
        Random random = new Random();
        int randomNumber = random.nextInt(15) + 1;
        String encoded = "";

        for(int i = 0; i < text.length(); i++){
            if (text.charAt(i) != ' '){
                encoded += (char)(text.charAt(i) + randomNumber);
            }else if (text.charAt(i) == ' '){
                encoded += " ";
            }
            //how to keep newline characters?
            /*else if(text.charAt(i) == '\\'){
                if(text.charAt(i+1) == 'n'){
                    encoded += "\n";
                }
            }*/
            else{
                System.out.println("Something went wrong!");
            }
        }
        return encoded;
    }
}

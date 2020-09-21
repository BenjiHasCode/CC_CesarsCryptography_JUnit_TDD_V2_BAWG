package Basic;

import java.util.Scanner;

public class Decoder {
    public static String decode(String text){
        String decodedText = "";
        int decodeValue = 0;
        Scanner scanner = new Scanner(text);
        while(scanner.hasNext()){
            String word = scanner.next();
            if(word.length() == 3){
                for (int i = 15; i > 0; i--){
                    String temp = "";
                    for(int j = 0; j < word.length(); j++){
                        temp += (char)(word.charAt(j) - i);
                    }
                    if(temp.equals("the")){
                        decodeValue = i;
                        break;
                    }
                }
            }
        }

        for(int i = 0; i < text.length(); i++){
            if (text.charAt(i) != ' '){
                decodedText += (char)(text.charAt(i) - decodeValue);
            }else if (text.charAt(i) == ' '){
                decodedText += " ";
            }
            else{
                System.out.println("Something went wrong!");
            }
        }
        return decodedText;
    }
}

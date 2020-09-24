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
                for (int i = 10; i > 0; i--){
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

        Scanner lineScanner = new Scanner(text);
        while(lineScanner.hasNext()){
            String line = lineScanner.nextLine();

            for(int i = 0; i < line.length(); i++){
                if (line.charAt(i) != ' '){
                    decodedText += (char)(line.charAt(i) - decodeValue);
                }else if (line.charAt(i) == ' '){
                    decodedText += " ";
                }
                else{
                    System.out.println("Something went wrong!");
                }
            }
            decodedText += "\n";
        }
        return decodedText;
    }
}